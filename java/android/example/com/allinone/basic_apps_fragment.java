package android.example.com.allinone;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;


public class basic_apps_fragment extends android.support.v4.app.Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Create an OnItemClickListener
        View v=inflater.inflate(R.layout.basic_apps_fragment,container,false);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        switch (position) {
                            case 0:
                                        Intent intent = new Intent(getActivity(),
                                        basic_buttons_usage.class);
                                        startActivity(intent);
                                        break;
                            case 1:
                                Intent intent2 = new Intent(getActivity(),
                                        create_message.class);
                                startActivity(intent2);
                                break;
                            case 2:
                                        Intent intent1=new Intent(getActivity(),stopwatch_activity.class);
                                        startActivity(intent1);
                                        break;
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView)v.findViewById(R.id.list_options);
        listView.setOnItemClickListener(itemClickListener);
        return v;
    }

    public static android.support.v4.app.Fragment Newinstance(){

        basic_apps_fragment frag=new basic_apps_fragment();
        return frag;
    }


}

