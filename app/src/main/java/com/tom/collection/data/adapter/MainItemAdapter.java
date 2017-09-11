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
 * 创建时间:2017/9/8 0008 16:10
 */

public class MainItemAdapter extends BaseAdapter {
    private static final String[] listArr = {"振动数据采集", "数据报表", "振动趋势"};

    private Context mContext;

    public MainItemAdapter(Context context) {
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
        ViewHolder viewHolder = null;
        if (convertView == null) {
            viewHolder = new ViewHolder();
            convertView = View.inflate(mContext, R.layout.home_list_item, null);
            viewHolder.mView = (TextView) convertView.findViewById(R.id.list_item);

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.mView.setText(getItem(position));

        return convertView;
    }

    class ViewHolder {
        TextView mView;
    }
}

