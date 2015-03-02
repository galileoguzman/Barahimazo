package com.galileoguzman.barahimazo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by galileoguzman on 26/02/15.
 */


public class SingleItemView extends Activity {
    // Declare Variables
    TextView txtName;
    TextView txtDescription;
    TextView txtLatitude;
    TextView txtLongitude;

    String name;
    String description;
    String latitude;
    String longitude;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);
// Retrieve data from MainActivity on item click event
        Intent i = getIntent();
// Get the results of rank
        name = i.getStringExtra("name");
// Get the results of country
        description = i.getStringExtra("description");
// Get the results of population
        latitude = i.getStringExtra("latitude");
        longitude = i.getStringExtra("longitude");

// Locate the TextViews in singleitemview.xml
        txtName = (TextView) findViewById(R.id.name);
        txtDescription = (TextView) findViewById(R.id.description);
        txtLatitude = (TextView) findViewById(R.id.latitude);
        txtLongitude = (TextView) findViewById(R.id.longitude);

// Load the results into the TextViews
        txtName.setText(name);
        txtDescription.setText(description);
        txtLatitude.setText(latitude);
        txtLongitude.setText(longitude);
    }
}
