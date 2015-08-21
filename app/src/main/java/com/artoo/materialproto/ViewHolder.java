package com.artoo.materialproto;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Sameer on 20/08/15.
 */
public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView tv;

    public ViewHolder(View v) {
        super(v);

        tv = (TextView) v.findViewById(R.id.text);
    }
}
