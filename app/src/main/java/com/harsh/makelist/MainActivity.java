package com.harsh.makelist;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        LayoutInflater layout = LayoutInflater.from(this);

        View customActionBar = layout.inflate(R.layout.custom_actionbar, null);
        TextView mainText = (TextView) customActionBar.findViewById(R.id.title_text);
        setTypeface(mainText);
        //mainText.setText("");

        actionBar.setCustomView(customActionBar);
        actionBar.setDisplayShowCustomEnabled(true);

    }

    public void setTypeface(TextView tv) {
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/productsans.ttf");
        tv.setTypeface(custom_font);
    }
}
