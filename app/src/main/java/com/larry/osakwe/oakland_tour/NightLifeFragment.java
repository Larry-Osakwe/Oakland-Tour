package com.larry.osakwe.oakland_tour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightLifeFragment extends Fragment {


    public NightLifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.location_list, container, false);


        //Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location("Cafe Van Cleef", "hold", R.drawable.cafevancleef));
        locations.add(new Location("Comedy Oakland", "hold", R.drawable.comedy_oakland));
        locations.add(new Location("Make Westing", "hold", R.drawable.make_westing));
        locations.add(new Location("Mad Oak", "hold", R.drawable.mad_oak));
        locations.add(new Location("Ruby Room", "hold", R.drawable.ruby_room));


        //Create an ArrayAdapter whose data source is a list of Strings.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.primary_light);

        //Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the ArrayAdapter created above
        listView.setAdapter(adapter);

        return rootView;
    }
}
