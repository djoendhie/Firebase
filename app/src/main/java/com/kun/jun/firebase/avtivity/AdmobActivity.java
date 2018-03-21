package com.kun.jun.firebase.avtivity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.kun.jun.firebase.R;
import com.kun.jun.firebase.admob.BannerActivity;
import com.kun.jun.firebase.admob.IntersitialActivity;
import com.kun.jun.firebase.admob.RewardVideoActivity;
import com.kun.jun.firebase.databinding.ActivityAdmobBinding;
import com.kun.jun.firebase.helper.MyFuction;

public class AdmobActivity extends MyFuction {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityAdmobBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_admob);

        binding.btnbanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent n = new Intent(AdmobActivity.this, BannerActivity.class);
//                startActivity(n);
//                startActivity(new Intent(AdmobActivity.this, BannerActivity.class));
//                finish();
                myIntent(BannerActivity.class);
            }
        });
        binding.btnintersetial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent(IntersitialActivity.class);
            }
        });
        binding.btnreward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myIntent(RewardVideoActivity.class);
            }
        });
    }
}