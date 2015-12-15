package com.h4402.ihm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

// https://romannurik.github.io/AndroidAssetStudio/icons-generic.html
public class MainActivity extends AppCompatActivity {

    private ListView join_view;
    private String[] restaurants_names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_view);

        join_view = (ListView) findViewById(R.id.join_view_restaurant_list);
        restaurants_names = new String[]{"Castor & Pollux", "RU Jussieu", "Olivier", "Grillon", "Kebab"};

        ArrayAdapter<String> join_view_adapter = new ArrayAdapter<String>(this, R.layout.join_view_restaurant, R.id.restaurant_name, restaurants_names);
        join_view.setAdapter(join_view_adapter);
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
