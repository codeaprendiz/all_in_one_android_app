package android.example.com.allinone;

import android.app.FragmentTransaction;
import android.graphics.Color;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ship_sink extends AppCompatActivity {

    Button zero,one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,
            fourteen, fifteen,sixteen,seventeen,eighteen, nineteen, twenty, twentyone,twentytwo,twentythree,twentyfour;
    TextView textView ;
    String result="miss";
    private ArrayList<Dotcom> DotcomsList=new ArrayList<Dotcom>();
    public int numOfGuesses=0;
    int[] allChosenLocations={-1,-1,-1,-1,-1,-1,-1,-1,-1};
    int randomNumber,index=0;
    int numOfKills=0;
    int indexOfFoundElement=0;
    String temporaryResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ship_sink);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        zero= (Button) findViewById(R.id.zero);
        one= (Button) findViewById(R.id.one);
        two= (Button) findViewById(R.id.two);
        three= (Button) findViewById(R.id.three);
        four= (Button) findViewById(R.id.four);
        five= (Button) findViewById(R.id.five);
        six= (Button) findViewById(R.id.six);
        seven= (Button) findViewById(R.id.seven);
        eight= (Button) findViewById(R.id.eight);
        nine= (Button) findViewById(R.id.nine);
        ten= (Button) findViewById(R.id.ten);
        eleven= (Button) findViewById(R.id.eleven);
        twelve= (Button) findViewById(R.id.twelve);
        thirteen= (Button) findViewById(R.id.thirteen);
        fourteen= (Button) findViewById(R.id.fourteen);
        fifteen= (Button) findViewById(R.id.fifteen);
        sixteen= (Button) findViewById(R.id.sixteen);
        seventeen= (Button) findViewById(R.id.seventeen);
        eighteen= (Button) findViewById(R.id.eighteen);
        nineteen= (Button) findViewById(R.id.nineteen);
        twenty= (Button) findViewById(R.id.twenty);
        twentyone= (Button) findViewById(R.id.twentyone);
        twentytwo= (Button) findViewById(R.id.twentytwo);
        twentythree= (Button) findViewById(R.id.twentythree);
        twentyfour= (Button) findViewById(R.id.twentyfour);
        textView= (TextView) findViewById(R.id.textView);

        SetupGame();
        checkGame();


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public String getButtonPressingResult(int userInput) {
        numOfGuesses++;
        String result="miss";
        for(Dotcom dotcomToCheck : DotcomsList) {
            temporaryResult=dotcomToCheck.checkForGivenLocation(userInput);
            Log.e("TemporaryResult is ", "for user input " + userInput + " TemporaryResult is " + temporaryResult);
            if(temporaryResult.equals("kill")) {
                numOfKills++;
                result="You killed "+dotcomToCheck.getName();
                if(numOfKills==3) {
                    result="Finished Game";
                    return result;
                }
                return result;
            }
            if(temporaryResult.equals("hit")) {
                result = "hit";
                return result;
            }
        }
        return result;
    }

    public void SetupGame() {

        Dotcom one=new Dotcom();
        one.setName("Pets.com");
        Dotcom two = new Dotcom();
        two.setName("eToys.com");
        Dotcom three = new Dotcom();
        three.setName("Go2.com");
        DotcomsList.add(one);
        DotcomsList.add(two);
        DotcomsList.add(three);

        for(Dotcom DotcomToSet : DotcomsList) {
            do {
                randomNumber=DotcomToSet.setLocationCells();
            }while(ifArrayContainsElement(allChosenLocations,9,randomNumber) || ifArrayContainsElement(allChosenLocations,9,randomNumber+1) ||
                    ifArrayContainsElement(allChosenLocations,9,randomNumber+2));
            allChosenLocations[index++]=randomNumber;
            allChosenLocations[index++]=randomNumber+1;
            allChosenLocations[index++]=randomNumber+2;
            Log.e("Dotcoms: ", DotcomToSet.getName() + "Location " + randomNumber + " " + (randomNumber + 1) + " " + (randomNumber + 2));
            Log.e("Dotcoms: "," "+ DotcomToSet.allocatedLocations[0]+" "+" "+DotcomToSet.allocatedLocations[1]+" "+" "+DotcomToSet.allocatedLocations[2]);
        }

    }

    public void checkGame() {

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=getButtonPressingResult(0);
                textView.setText(result);
                setButtonColour(zero,result);
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=getButtonPressingResult(1);
                textView.setText(result);
                setButtonColour(one,result);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(2);
                textView.setText(result);
                setButtonColour(two, result);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(3);
                textView.setText(result);
                setButtonColour(three, result);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(4);
                textView.setText(result);
                setButtonColour(four, result);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(5);
                textView.setText(result);
                setButtonColour(five, result);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(6);
                textView.setText(result);
                setButtonColour(six, result);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(7);
                textView.setText(result);
                setButtonColour(seven, result);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(8);
                textView.setText(result);
                setButtonColour(eight, result);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(9);
                textView.setText(result);
                setButtonColour(nine, result);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(10);
                textView.setText(result);
                setButtonColour(ten, result);
            }
        });

        eleven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(11);
                textView.setText(result);
                setButtonColour(eleven, result);
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(12);
                textView.setText(result);
                setButtonColour(twelve, result);
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(13);
                textView.setText(result);
                setButtonColour(thirteen, result);
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(14);
                textView.setText(result);
                setButtonColour(fourteen, result);
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(15);
                textView.setText(result);
                setButtonColour(fifteen, result);
            }
        });

        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(16);
                textView.setText(result);
                setButtonColour(sixteen, result);
            }
        });

        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(17);
                textView.setText(result);
                setButtonColour(seventeen, result);
            }
        });

        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result=getButtonPressingResult(18);
                textView.setText(result);
                setButtonColour(eighteen,result);
            }
        });

        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(19);
                textView.setText(result);
                setButtonColour(nineteen, result);
            }
        });

        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(20);
                textView.setText(result);
                setButtonColour(twenty, result);
            }
        });

        twentyone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(21);
                textView.setText(result);
                setButtonColour(twentyone, result);
            }
        });

        twentytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(22);
                textView.setText(result);
                setButtonColour(twentytwo, result);
            }
        });

        twentythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(23);
                textView.setText(result);
                setButtonColour(twentythree, result);
            }
        });

        twentyfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = getButtonPressingResult(24);
                textView.setText(result);
                setButtonColour(twentyfour, result);
            }
        });
    }

    public boolean ifArrayContainsElement(int[] array,int size,int element) {
        for(int i=0;i<size;i++) {
            if(array[i]==element) {
                indexOfFoundElement=i;
                return true;
            }
        }
        return false;
    }

    public void setButtonColour(Button button,String result) {
        button.setEnabled(false); // once the button is pressed, you cannot press it again
        if(result.equals("miss")) {
            button.setBackgroundColor(Color.parseColor("#f1290e"));
        }
        else if(result.equals("Finished Game")) {
            button.setBackgroundColor(Color.parseColor("#b5ffda"));
            finishgame();
        }
        else
            button.setBackgroundColor(Color.parseColor("#b5ffda"));
    }

    public void finishgame(){
        textView.setText("You took "+numOfGuesses+" guesses");
        Toast.makeText(getBaseContext(), "You finished the game with " + numOfGuesses + " guesses", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        //return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        // int id = item.getItemId();

        super.onOptionsItemSelected(item);
        switch (item.getItemId()) {
            case R.id.item1:
                Toast.makeText(getBaseContext(), "Work in progress for Settings :P", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                FragmentTransaction ft=getFragmentManager().beginTransaction();
                helpFragment frag=new helpFragment();
                //the following id should be fragmentLinearLayout but it crashes when i give that. Surprisingly when i give the id of content_ship_sink linear layout, it works
                ft.add(R.id.mainLinearLayout,frag);
                ft.addToBackStack(null);
                ft.commit();
                break;
        }
        return true;
        //noinspection SimplifiableIfStatement
        /*
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
        */
    }

    @Override
    public void onBackPressed() {

        if(getFragmentManager().getBackStackEntryCount() == 0)
            android.os.Process.killProcess(android.os.Process.myPid());
        else
            getFragmentManager().popBackStack();

    }


}
