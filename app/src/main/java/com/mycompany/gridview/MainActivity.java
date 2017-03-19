package com.mycompany.gridview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView gv;
    Context context;
    ArrayList andvers;
    public static String [] andverslist={"Gingerbread","Honeycomb","Icecream","Jellybean","Kitkat","Lollipop"};
    public static int [] andversImages={R.drawable.ginger,R.drawable.honey,R.drawable.ice,R.drawable.jelly,R.drawable.kitkat,R.drawable.lolly};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=(GridView) findViewById(R.id.gridview);
        gv.setAdapter(new CustomAdapter(this, andverslist,andversImages));
    }
}
