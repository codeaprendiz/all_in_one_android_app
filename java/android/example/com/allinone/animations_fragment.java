package android.example.com.allinone;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class animations_fragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.animations_fragment, container, false);

        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {

                        switch (position) {

                            case 0:
                                Intent intent2 = new Intent(getActivity(),
                                        CardFlipActivity.class);
                                startActivity(intent2);
                                break;
                            case 1:
                                Intent intent3 = new Intent(getActivity(),
                                        ZoomActivity.class);
                                startActivity(intent3);
                                break;
                            case 2:
                                Intent intent1 = new Intent(getActivity(),
                                        ScreenSlideActivity.class);
                                startActivity(intent1);
                                break;
                            case 3:
                                Intent intent = new Intent(getActivity(),
                                        CrossfadeActivity.class);
                                startActivity(intent);
                                break;
                            case 4:
                                Intent intent4 = new Intent(getActivity(),
                                        LayoutChangesActivity.class);
                                startActivity(intent4);
                                break;

                        }


                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView)v.findViewById(R.id.list_options_animations);
        listView.setOnItemClickListener(itemClickListener);
        return v;
    }

    public static android.support.v4.app.Fragment Newinstance(){
        animations_fragment frag=new animations_fragment();
        return frag;
    }

}
