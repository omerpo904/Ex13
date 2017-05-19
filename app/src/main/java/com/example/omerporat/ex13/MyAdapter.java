package com.example.omerporat.ex13;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.widget.ResourceCursorAdapter;

/**
 * Created by omer porat on 05/19/2017.
 */

public class MyAdapter extends ResourceCursorAdapter{

    public MyAdapter(Context context, int layout, Cursor c, boolean autoRequery) {
        super(context, layout, c, autoRequery);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

    }
}
