package com.h4402.ihm.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;


import com.h4402.ihm.Model.Group;
import com.h4402.ihm.Model.Restaurant;
import com.h4402.ihm.Model.User;
import com.h4402.ihm.View.JoinViewAdapter;
import com.h4402.ihm.R;

import java.util.ArrayList;
import java.util.List;

// https://romannurik.github.io/AndroidAssetStudio/icons-generic.html

/**
 *
 */
public class MainActivity extends AppCompatActivity {

    private ListView joinViewRestaurantsList;
    private LinearLayout joinViewGroup;
    private List<Restaurant> restaurants;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_view);

        // Creating people manually
        User user1 = new User("Luke Skywalker", R.drawable.av6);
        User user2 = new User("Kylo Ren", R.drawable.av4);
        User user3 = new User("Finn", R.drawable.av7);
        User user4 = new User("Dark Vador", R.drawable.av5);
        User user5 = new User("Obi-Wan Kenobi", R.drawable.av8);
        User user6 = new User("Stormtrooper", R.drawable.av9);

        // Creating groups manually
        ArrayList<User> listUsersGroup1 = new ArrayList<User>();
        listUsersGroup1.add(user3);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        listUsersGroup1.add(user6);
        Group group1 = new Group("Troopers", listUsersGroup1, "12h15");

        ArrayList<User> listUsersGroup2 = new ArrayList<User>();
        listUsersGroup2.add(user1);
        listUsersGroup2.add(user5);
        Group group2 = new Group("Chevalier Jedi", listUsersGroup2, "11h45");

        ArrayList<User> listUsersGroup3 = new ArrayList<User>();
        listUsersGroup3.add(user2);
        listUsersGroup3.add(user4);
        Group group3 = new Group("Chevaliers Sith", listUsersGroup3, "12h00");

        // Creating restaurants
        Restaurant resto1 = new Restaurant("Cantina de Mos-Esley");
        resto1.addGroup(group2);

        Restaurant resto2 = new Restaurant("Self de l'empire");
        resto2.addGroup(group3);
        resto2.addGroup(group1);

        Restaurant resto3 = new Restaurant("Cabine du Faucon Millenium");
        resto3.addGroup(group2);
        resto3.addGroup(group3);

        restaurants = new ArrayList<Restaurant>();
        restaurants.add(resto1);
        restaurants.add(resto2);
        restaurants.add(resto3);

        // Linking the ListView to its adapter
        joinViewRestaurantsList = (ListView) findViewById(R.id.join_view_restaurants_list);

        JoinViewAdapter joinViewRestaurantsListAdapter = new JoinViewAdapter(this, restaurants);
        joinViewRestaurantsList.setAdapter(joinViewRestaurantsListAdapter);

        //join_view_group = (LinearLayout) findViewById(R.id.group_container);
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
