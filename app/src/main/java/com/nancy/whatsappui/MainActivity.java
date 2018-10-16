package com.nancy.whatsappui;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Display;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycle;
    private RecyclerViewAdapter adapter;
    //private List<ModelClass> listModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = findViewById(R.id.recycler);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TabLayout tabLayout=(TabLayout)findViewById(R.id.tabs);

        tabLayout.addTab(tabLayout.newTab().setText("CHATS"));
        tabLayout.addTab(tabLayout.newTab().setText("STATUS"));
        tabLayout.addTab(tabLayout.newTab().setText("CALLS"));
        LinearLayoutManager lay=new LinearLayoutManager(this);
        recycle.setLayoutManager(lay);


        DividerItemDecoration decoration = new DividerItemDecoration(this, lay.getOrientation());
        recycle.addItemDecoration(decoration);

        List<ModelClass> listModelCopy  = setData("Nancy","12:00","Hi");
        //listModelCopy = setData("Adi","13:00","Bye");

        adapter = new RecyclerViewAdapter(this,listModelCopy);
        recycle.setAdapter(adapter);

    }

    public List<ModelClass> setData(String name,String time,String msg)
    {
        ModelClass m = new ModelClass(name,time,msg);
         List<ModelClass> model = new ArrayList<ModelClass>();
         model.add(m);

       return model;
    }
}
