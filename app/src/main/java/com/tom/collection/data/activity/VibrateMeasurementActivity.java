package com.tom.collection.data.activity;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import com.tom.collection.data.MyAppActivity;
import com.tom.collection.data.R;
import com.tom.collection.data.adapter.MeasureAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VibrateMeasurementActivity extends MyAppActivity {


    @BindView(R.id.gv)
    GridView mGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ButterKnife.bind(this);



    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_data_collection;
    }

    @Override
    public void initEvent() {
        mGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }

    @Override
    public void initView() {
        initActionBar(getString(R.string.vibrate_measurement));
        initGridView();



    }









    private void initGridView() {
        mGv.setAdapter(new MeasureAdapter(this));

    }
}
