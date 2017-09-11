package com.tom.collection.data.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tom.collection.data.MyAppActivity;
import com.tom.collection.data.R;
import com.tom.collection.data.adapter.StatementAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class StatementActivity extends MyAppActivity {

    @BindView(R.id.statement_list)
    ListView mStatementList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public int getLayoutResId() {
        return R.layout.activity_statement;
    }

    @Override
    public void initEvent() {
        initListView();
    }

    @Override
    public void initView() {
        initActionBar(getString(R.string.statement));
        mStatementList.setAdapter(new StatementAdapter(this));
    }



    private void initListView() {
        mStatementList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 1:

                        break;
                    default:
                        break;
                }
            }
        });
    }
}
