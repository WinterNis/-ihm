package com.h4402.ihm.join_view;

import android.content.Context;
import android.widget.ArrayAdapter;

import com.h4402.ihm.Model.Restaurant;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by thomas on 15/12/2015.
 */
public class Join_view_adapter extends ArrayAdapter<String>{

    private static List<String> restaurantsToString(List<Restaurant> restaurants){
        List<String> restaurant_names = new LinkedList<String>();
        for(Restaurant r : restaurants){
            restaurant_names.add(r.getName());
        }
        return restaurant_names;
    }

    public Join_view_adapter(Context context, int resource, int textViewResourceId, List<Restaurant> restaurants) {
        super(context, resource, textViewResourceId, restaurantsToString(restaurants));

    }


}
