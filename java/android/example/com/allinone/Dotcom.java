package android.example.com.allinone;

/*
In this project i am creating my custom app_bar icon as the default one is not working.
But i have tried to use the default one. It never shows up.
As per the design of this app first the default one should be shown and then custom action bar should be shown.
As the default one never shows up (of which i have no idea why) we see the custom toolbar when the app is launched.
        */

        import android.util.Log;
        import java.util.Random;
public class Dotcom {

    public String name,test;
    public int[] allowedAllLocations={0,1,2,5,6,7,10,11,12,15,16,17,20,21,22};
    public int[] allocatedLocations={-1,-1,-1};
    int numOfHits=0;
    int randromNumber=0,count=0,index,indexCheck=0,indexOfFoundElement=0;

    public void setName(String n) {
        name=n;
    }

    public String getName() {
        return name;
    }

    public boolean ifArrayContainsElement(int[] array,int size,int element) {
        for(int i=0;i<size;i++) {
            if(array[i]==element) {
                indexOfFoundElement=i;
                Log.e("Found element"," "+element+" at index"+ indexOfFoundElement );
                return true;
            }
        }
        return false;
    }

    public int setLocationCells() {
        Random random=new Random();
        index=0;
        do {
            randromNumber=random.nextInt(24);
            count++;
        }while(!ifArrayContainsElement(allowedAllLocations,15,randromNumber));
        // i.e. no need to continue to the loop anymore as the random number is in allowedAllLocations as we can place the calling Dotcom there

        allocatedLocations[index++]=randromNumber;
        allocatedLocations[index++]=randromNumber+1;
        allocatedLocations[index++]=randromNumber+2;
        return randromNumber;
    }

    //to check if the calling Dotcom object has a location as given by the user
    public String checkForGivenLocation(int userInput) {
        String result="miss";
        Log.e("Values "," "+allocatedLocations[0]+" "+allocatedLocations[1]+" "+allocatedLocations[2]);
        if(ifArrayContainsElement(allocatedLocations,3,userInput)) {
            result="hit";
            numOfHits++;
            Log.e("Initial value "," "+allocatedLocations[indexOfFoundElement]);
            allocatedLocations[indexOfFoundElement]=-1; // if the user guesses this again then there should be no effect
            Log.e("Final value "," "+allocatedLocations[indexOfFoundElement]);
            if(numOfHits==3) {
                result="kill";
            }
        }
        return result;
    }

}

