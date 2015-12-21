package com.h4402.ihm.View;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.h4402.ihm.Model.Group;
import com.h4402.ihm.Model.Restaurant;
import com.h4402.ihm.R;

import java.util.List;

/**
 * Created by thomas on 15/12/2015.
 * Adapter changing the list of restaurant into a ListView
 */
public class JoinViewAdapter extends ArrayAdapter<Restaurant>{

    public JoinViewAdapter(Context context, List<Restaurant> restaurants) {
        super(context, 0, restaurants);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Restaurant resto = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.join_view_restaurant, parent, false);
        }
        // Lookup view for data population
        TextView restaurantName = (TextView) convertView.findViewById(R.id.restaurant_name);
        // Set the restaurant name
        restaurantName.setText(resto.getName());
        // Then set the groups inside
        LinearLayout groupsContainer = (LinearLayout) convertView.findViewById(R.id.group_container);
        JoinViewGroups viewGroups = new JoinViewGroups(getContext(),groupsContainer);
        viewGroups.setGroups(resto.getGroups());
        // Return the completed view to render on screen
        return convertView;
    }
}
