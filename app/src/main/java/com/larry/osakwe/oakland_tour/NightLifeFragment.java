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


        locations.add(new Location("Cafe Van Kleef", "1621 Telegraph Ave",
                "(510) 763-7711", "Hip watering hole offering craft cocktails & live music in" +
                " digs packed with funky art & knickknacks", R.drawable.cafevancleef));
        locations.add(new Location("Comedy Oakland", "1628 Webster St",
                "(510) 214-2626", "Features up-and-coming comedians alongside industry pros. " +
                "Some comedians have featured on TV, radio, comedy festivals," +
                " late night talk shows and won competitions", R.drawable.comedy_oakland));
        locations.add(new Location("Make Westing", "1741 Telegraph Ave",
                "(510) 251-1400", "Large bar featuring cocktails, elevated bar bites & bocce ball" +
                " in a buzzing, contemporary space.", R.drawable.make_westing));
        locations.add(new Location("Mad Oak Bar", "135 12th St",
                "(510) 924-2047", "Beers on tap, cocktails, food-truck menus & sports TV in a " +
                "chill bar with a patio & rooftop deck", R.drawable.mad_oak));
        locations.add(new Location("Ruby Room", "132 14th St",
                "(510) 444-7224", "Compact, edgy hangout offering a selection of cocktails," +
                " beer & bar snacks, plus DJ music.", R.drawable.ruby_room));


        //Create an ArrayAdapter whose data source is a list of Strings.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.primary_light);

        //Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the ArrayAdapter created above
        listView.setAdapter(adapter);

        return rootView;
    }
}
