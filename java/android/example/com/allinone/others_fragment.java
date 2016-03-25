package android.example.com.allinone;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

public class others_fragment extends android.support.v4.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Create an OnItemClickListener

        View v=inflater.inflate(R.layout.others_fragment,container,false);
        AdapterView.OnItemClickListener itemClickListener =
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> listView,
                                            View v,
                                            int position,
                                            long id) {
                        switch (position) {
                            case 0:
                                Intent intent = new Intent(getActivity(),
                                ship_sink.class);
                                startActivity(intent);
                                break;
                            case 1:
                                Intent intent2 = new Intent(getActivity(),
                                        calculator.class);
                                startActivity(intent2);
                                break;
                        }
                    }
                };
        //Add the listener to the list view
        ListView listView = (ListView)v.findViewById(R.id.list_options_others_fragment);
        listView.setOnItemClickListener(itemClickListener);
        return v;

      //  return inflater.inflate(R.layout.others_fragment,container,false);
    }

    public static android.support.v4.app.Fragment Newinstance(){

        others_fragment frag=new others_fragment();
        return frag;
    }
}

