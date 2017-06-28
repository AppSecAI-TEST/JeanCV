package com.jandewu.jeancv.Model;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.jandewu.jeancv.R;

/**
 * Created by RENT on 2017-06-26.
 */

public class PhoneItem extends CVItem {
    public static final String PHONE_NUMBER = "603870653";
    private int ImageId;
    String name;

    public PhoneItem()
    {
        super(R.drawable.ic_phone_black_24dp, PHONE_NUMBER);
    }

    private void call(Context context){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+PHONE_NUMBER));
        context.startActivity(intent);
    }

    @Override
    public void makeAction(Context context){
       call(context);
    }


}
