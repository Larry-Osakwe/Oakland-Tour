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
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);


        //Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();


        locations.add(new Location("Tacos Mi Rancho", "1434 1st Ave",
                "(510) 395-1403", "Casual, cash-only spot for Mexican street food such as tacos" +
                " & huge burritos, served till late", R.drawable.tacos_rancho));
        locations.add(new Location("Wood Tavern", "6317 College Ave",
                "(510) 654-6607", "Californian-inspired menu of sustainable fare plus wine" +
                " in a modern-rustic setting", R.drawable.wood_tavern));
        locations.add(new Location("Homeroom", "400 40th St",
                "(510) 597-0400", "Offers fancy mac 'n' cheese for kids of all ages plus" +
                " adults-only beer floats", R.drawable.homeroom));
        locations.add(new Location("Aunt Mary's Cafe", "4640 Telegraph Ave",
                "(510) 601-9227", "A cozy local cafe serving homey comfort food with a Southern" +
                " & Southwestern twist in an airy space", R.drawable.aunt_marys));


        //Create an ArrayAdapter whose data source is a list of Strings.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.primary_light);

        //Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the ArrayAdapter created above
        listView.setAdapter(adapter);

        return rootView;
    }

}
