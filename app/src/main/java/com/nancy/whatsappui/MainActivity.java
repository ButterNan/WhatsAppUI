package com.nancy.whatsappui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycle;
    private RecyclerViewAdapter adapter;
    private List<ModelClass> listModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recycle = findViewById(R.id.recycler);

        LinearLayoutManager lay=new LinearLayoutManager(this);
        recycle.setLayoutManager(lay);


        DividerItemDecoration decoration = new DividerItemDecoration(this, lay.getOrientation());
        recycle.addItemDecoration(decoration);

        listModel = new ArrayList<ModelClass>();

        setData();
        adapter = new RecyclerViewAdapter(this,listModel);
        recycle.setAdapter(adapter);

    }

    public void setData()
    {
        ModelClass m = new ModelClass("Nancy","12:00","Hi");
        listModel.add(m);

        ModelClass n = new ModelClass("Adi","1:00","Hi Baby");
        listModel.add(n);

        ModelClass p = new ModelClass("Adi mom","0:00","Hi Beta");
        listModel.add(p);

        ModelClass q = new ModelClass("Adi Berlin","3:00","Hi Berlin hero");
        listModel.add(q);

    }
}
