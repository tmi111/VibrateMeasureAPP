package com.tom.collection.data;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tom.collection.data.R;

import butterknife.ButterKnife;

public abstract class MyAppActivity extends AppCompatActivity {

    private ActionBar mSupportActionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());
        ButterKnife.bind(this);
        initView();
        initEvent();
    }

    public abstract int getLayoutResId();

    public abstract void initEvent();

    public abstract void initView();

    protected void initActionBar(String titleName) {
        ActionBar.LayoutParams lp = new ActionBar.LayoutParams
                (ActionBar.LayoutParams.MATCH_PARENT, ActionBar.LayoutParams.MATCH_PARENT,Gravity.CENTER_HORIZONTAL);

        RelativeLayout titleView = (RelativeLayout) LayoutInflater.from(this).inflate(R.layout.home_title, null);
        TextView titleTV = (TextView) titleView.findViewById(R.id.home_anctionbar_title);

        titleTV.setText(titleName);
        mSupportActionBar = getSupportActionBar();
        mSupportActionBar.setCustomView(titleView, lp);

        mSupportActionBar.setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);



    }
/*    //子实现类想要什么ActionBar都在里面实现
    public abstract View actionBarViewSet();*/





}
