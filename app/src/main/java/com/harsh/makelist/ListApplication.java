package com.harsh.makelist;

import android.app.Application;

/**
 * Created by Harsh on 12/4/2016.
 */
public class ListApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //TypefaceUtil.overrideFont(getApplicationContext(), "SANSERIF", "fonts/productsans.ttf");
        TypefaceUtil.setDefaultFont(this, "SANS_SERIF", "fonts/productsans.ttf");

    }

}
