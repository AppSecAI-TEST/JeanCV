package com.jandewu.jeancv.Model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import com.jandewu.jeancv.Model.CVItem;
import com.jandewu.jeancv.R;

/**
 * Created by RENT on 2017-06-26.
 */

public class MailItem extends CVItem{

    public MailItem(String name)
    {
        super(R.drawable.ic_mail_outline_black_24dp, name);
    }
    private void mail(Context context){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:wartalski.jan@gmail.com"));
        intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"mailto:wartalski.jan@gmail.com"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "mailto:wartalski.jan@gmail.com");
        context.startActivity(intent);
        }

    @Override
    public void makeAction(Context context){
        mail(context);
    }

}
