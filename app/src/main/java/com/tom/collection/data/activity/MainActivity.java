package com.tom.collection.data.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.tom.collection.data.MyAppActivity;
import com.tom.collection.data.R;
import com.tom.collection.data.adapter.MainItemAdapter;

import butterknife.BindView;

public class MainActivity extends MyAppActivity {

    @BindView(R.id.lv)
    ListView mLv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //actionbar居中
    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initEvent() {
        mLv.setAdapter(new MainItemAdapter(this));
        MainItemSelect();
    }

    @Override
    public void initView() {
        initActionBar(getString(R.string.home));
    }



    private void MainItemSelect() {
       mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Intent intent;
               switch (position) {
                   case 0:
                        intent = new Intent(MainActivity.this, VibrateMeasurementActivity.class);
                       startActivity(intent);
                       break;
                   case 1:
                        intent = new Intent(MainActivity.this, StatementActivity.class);
                       startActivity(intent);
                       break;

                   default:
                       break;
               }
           }
       });
    }


}
