package com.h4402.ihm.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;


import com.h4402.ihm.Model.Restaurant;
import com.h4402.ihm.R;
import com.h4402.ihm.join_view.Join_view_adapter;

import java.util.LinkedList;
import java.util.List;

// https://romannurik.github.io/AndroidAssetStudio/icons-generic.html
public class MainActivity extends AppCompatActivity {

    private ListView join_view;
    private LinearLayout join_view_group;
    private List<Restaurant> restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_view);

        // Creating groups manually

        // Creating restaurants from the String[].
        String[] restaurants_names = new String[]{"Castor & Pollux", "RU Jussieu", "Olivier", "Grillon", "Kebab"};
        restaurants = new LinkedList<>();
        for (String s : restaurants_names){
            restaurants.add(new Restaurant(s));
        }

        // Adding groups to the restaurants

        // Linking the ListView to its adapter
        join_view = (ListView) findViewById(R.id.join_view_restaurant_list);

        Join_view_adapter join_view_adapter = new Join_view_adapter(this, R.layout.join_view_restaurant, R.id.restaurant_name, restaurants);
        join_view.setAdapter(join_view_adapter);

        join_view_group = (LinearLayout) findViewById(R.id.group_container);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
