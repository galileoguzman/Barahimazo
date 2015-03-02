package com.galileoguzman.barahimazo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseUser;

/**
 * Created by galileoguzman on 26/02/15.
 */
public class BarahimazoApplication extends Application {


    public void onCreate() {
        super.onCreate();

        // Add your initialization code here
        Parse.initialize(this, "yourKey", "yourAppID");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        // If you would like all objects to be private by default, remove this line.
        defaultACL.setPublicReadAccess(true);

        ParseACL.setDefaultACL(defaultACL, true);
    }

}
