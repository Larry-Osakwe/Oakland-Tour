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
public class DayLifeFragment extends Fragment {


    public DayLifeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        //Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location("First Friday", "hold", R.drawable.first_friday));
        locations.add(new Location("Farmers Market", "hold", R.drawable.lake_farmers_market));
        locations.add(new Location("Paddle Boats", "hold", R.drawable.lakepeddleboat));
        locations.add(new Location("Oakland Zoo", "hold", R.drawable.oakland_zoo));
        locations.add(new Location("Observatory", "hold", R.drawable.observatory));
        locations.add(new Location("Sibley Volcanic Trail", "hold", R.drawable.sibley_volcanic_trail));
        locations.add(new Location("Oakland Museum", "hold", R.drawable.oak_museum));



        //Create an ArrayAdapter whose data source is a list of Strings.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.primary_light);

        //Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the ArrayAdapter created above
        listView.setAdapter(adapter);

        return rootView;

    }

}
