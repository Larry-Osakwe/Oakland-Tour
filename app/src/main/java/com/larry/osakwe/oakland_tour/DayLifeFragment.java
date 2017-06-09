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

        //String name, String address, String number, String description, int imageResourceId
        locations.add(new Location("First Friday", "Telegraph Ave. from W. Grand to 27th St.",
                "(510) 361-0615", "Oakland First Fridays is an immersive art and community " +
                "experience on the first Friday of each month from 5:00 p.m. to 9:30 p.m. ",
                R.drawable.first_friday));
        locations.add(new Location("Grand Lake Farmers Market", "Lake Park Ave", "(415) 472-6100",
                "The Oakland farmers market is open every Saturday, year-round, " +
                        "rain or shine, from 9am to 2pm",
                R.drawable.lake_farmers_market));
        locations.add(new Location("Lake Merritt Boating Center", "568 Bellevue Avenue",
                "(510) 238-2196", "Lake Merritt is a unique saltwater tidal lake conveniently" +
                " located in the center of downtown Oakland. Enjoy a day outdoors on the Lake." +
                " For pedalboat, canoe, row boat, and kayak rentals, no certification is required",
                R.drawable.lakepeddleboat));
        locations.add(new Location("Oakland Zoo", "9777 Golf Links Rd", "(510) 632-9525",
                "Oakland Zoo is a 100-acre zoo located in southeastern Oakland. Most of its" +
                        " animals are kept in relatively \"natural\" habitats, and expanded" +
                        " natural habitats are planned", R.drawable.oakland_zoo));
        locations.add(new Location("Chabot Space and Science Center", "10000 Skyline Blvd",
                "(510) 336-7300", "Chabot Space and Science Center is a hands-on center featuring" +
                " interactive exhibits, a digital planetarium, a large screen theater, hands-on" +
                " activities and three powerful telescopes.", R.drawable.observatory));
        locations.add(new Location("Sibley Volcanic Regional Preserve", "6701 Skyline Blvd",
                "(888) 327-2757", "The site of an ancient volcano, this park offers self-guided" +
                " tours & features many hiking trails", R.drawable.sibley_volcanic_trail));
        locations.add(new Location("Oakland Museum", "1000 Oak St", "(510) 318-8400",
                "Artifacts & interactive displays in a modern building focusing on state art," +
                        " history & science.", R.drawable.oak_museum));

        //Create an ArrayAdapter whose data source is a list of Strings.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.primary_light);

        //Find the ListView object in the view hierarchy of the Activity
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        //Make the ListView use the ArrayAdapter created above
        listView.setAdapter(adapter);

        return rootView;

    }

}
