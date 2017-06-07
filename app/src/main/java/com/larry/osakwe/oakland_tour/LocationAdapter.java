package com.larry.osakwe.oakland_tour;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Larry Osakwe on 6/7/2017.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    private int colorResourceId;

    public LocationAdapter(Activity context, ArrayList<Location> locations, int colorResourceId) {
        super(context, 0, locations);
        this.colorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position,View convertView,ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView locationName = (TextView)listItemView.findViewById(R.id.location_name);
        locationName.setText(currentLocation.getName());

        TextView locationDescription = (TextView)listItemView.findViewById(R.id.location_description);
        locationDescription.setText(currentLocation.getDescription());

        ImageView locationImage = (ImageView)listItemView.findViewById(R.id.location_image);
        locationImage.setImageResource(currentLocation.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundResource(colorResourceId);

        return listItemView;


    }
}
