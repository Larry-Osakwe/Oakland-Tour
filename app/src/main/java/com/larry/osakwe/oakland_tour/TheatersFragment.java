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
public class TheatersFragment extends Fragment {


    public TheatersFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        //Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();

        //String name, String address, String number, String description, int imageResourceId
        locations.add(new Location("Grand Lake Theater", "3200 Grand Ave", "(510) 452-3556", "The Grand Lake Theatre is a historic movie palace. Features a $5 Tuesday deal.", R.drawable.grandlake_theater));
        locations.add(new Location("Piedmont Theater", "hold", R.drawable.peidmont_theater));
        locations.add(new Location("Newpark Couch Theater", "hold", R.drawable.newpark_couch_theater));


        //Create an ArrayAdapter whose data source is a list of Strings.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.primary_light);

        //Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the ArrayAdapter created above
        listView.setAdapter(adapter);

        return rootView;
    }

}
