package com.jandewu.jeancv.Model;

import android.content.Context;

import com.jandewu.jeancv.R;

/**
 * Created by RENT on 2017-06-26.
 */

public class NoActionItem extends CVItem {


    public NoActionItem(String name)
    {
      super(R.drawable.it, name);
        // tu cokolwiek
    }

    @Override
    public void makeAction(Context context) {
        //Leave empty
    }
}
