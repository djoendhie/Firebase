package com.kun.jun.firebase.client;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.kun.jun.firebase.R;


/**
 * Created by Blackswan on 7/19/2017.
 */

public class MyHolder {
  public TextView nameText,infoText;
   public ImageView img;
    public MyHolder(View view){
        nameText = (TextView)view.findViewById(R.id.nameTxt);
        infoText = (TextView)view.findViewById(R.id.infoTxt);
        img = (ImageView)view.findViewById(R.id.beachimage);

    }
}
