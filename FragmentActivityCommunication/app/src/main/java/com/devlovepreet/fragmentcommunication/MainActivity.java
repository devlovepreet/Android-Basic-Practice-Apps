package com.devlovepreet.fragmentcommunication;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ColorFragment.OnColorChangeListener {

    LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = (LinearLayout) findViewById(R.id.main_layout_id);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        ColorFragment colorFragment = new ColorFragment();
        fragmentTransaction.add(R.id.fragment_container,colorFragment);
        fragmentTransaction.commit();
    }

    @Override
    public void colorChanged(String color_name) {
        if(color_name.equals("RED"))
        {
            linearLayout.setBackgroundColor(Color.RED);
        }
        else if(color_name.equals("GREEN")){
            linearLayout.setBackgroundColor(Color.GREEN);
        }
        else if(color_name.equals("BLUE"))
        {
            linearLayout.setBackgroundColor(Color.BLUE);
        }
        else if(color_name.equals("ORIGINAL"))
        {
            linearLayout.setBackgroundColor(Color.WHITE);
        }
    }
}
