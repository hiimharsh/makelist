package com.harsh.makelist;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Lists> lists = new ArrayList<>();
    private Lists list;
    private RecyclerView recyclerView;
    private ListAdapter mAdapter;
    private EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Custom Action Bar
        setCustomActionBar(getSupportActionBar(), this);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new ListAdapter(lists);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        edittext = (EditText) findViewById(R.id.edittext);
        edittext.setOnEditorActionListener(new TextView.OnEditorActionListener() {
        public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
            if ((event != null && (event.getKeyCode() == KeyEvent.KEYCODE_ENTER)) || (actionId == EditorInfo.IME_ACTION_DONE)) {
                list = new Lists(edittext.getText() + "", "", "");
                lists.add(list);
                Toast.makeText(getApplicationContext(), edittext.getText() + " ", Toast.LENGTH_LONG).show();
                edittext.setText("");
            }
            return false;
        }
    });

        customData();

    }

    public void customData() {
        Lists list = new Lists("New MacBook Pro", "March 2017", "Pending");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Pending");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Remaining");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Done");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Pending");
        lists.add(list);

        list = new Lists("New MacBook Pro #Awesome Laptop", "March 2017", "Done");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Pending");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Pending");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Remaining");
        lists.add(list);

        list = new Lists("New MacBook Pro", "March 2017", "Done");
        lists.add(list);
    }

    public void setCustomActionBar(ActionBar actionBar, Context context) {
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);

        LayoutInflater layout = LayoutInflater.from(context);

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
