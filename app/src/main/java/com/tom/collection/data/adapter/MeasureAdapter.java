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
 * 创建时间:2017/9/8 0008 16:09
 */

public class MeasureAdapter extends BaseAdapter{
    private static final String[] listArr = {"振动加速度", "振动速度", "振动位移", "添加采集点"};

    private Context mContext;

    public MeasureAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getCount() {
        return listArr.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = View.inflate(mContext, R.layout.mesure_grid_item, null);
        }
        TextView textView = (TextView) convertView.findViewById(R.id.MeasurePageText);

        textView.setText(listArr[position]);
        return convertView;
    }
}
