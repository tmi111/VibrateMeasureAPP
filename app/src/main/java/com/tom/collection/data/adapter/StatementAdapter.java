package com.tom.collection.data.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.tom.collection.data.R;

/**
 * 项目名称:MyApplication
 * 创建人:zhouxiaohua
 * 创建时间:2017/9/9 0009 14:15
 */

public class StatementAdapter extends BaseAdapter {

    private static final String[] listArr = {"采集点--上海", "采集点--虎门", "采集点--东莞","采集点--深圳","采集点--北京"};
    private Context mContext;

    public StatementAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return listArr.length;
    }

    @Override
    public String getItem(int position) {
        return listArr[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.statment_item, null);
        }
        TextView tv = (TextView) convertView.findViewById(R.id.statement_item_tv);
        tv.setText(getItem(position));
        return convertView;
    }

}
