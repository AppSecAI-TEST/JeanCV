package com.jandewu.jeancv.Model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.jandewu.jeancv.R;

/**
 * Created by RENT on 2017-06-26.
 */

public class WebItem extends CVItem {


    public WebItem(String name)
    {
        super(R.drawable.ic_language_black_24dp, name);

    }
    private void goToWeb(Context context){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://google.com"));
        context.startActivity(intent);
    }

    @Override
    public void makeAction(Context context){
        goToWeb(context);
    }

}
