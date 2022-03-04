package com.gouzhong1223.androidtvtset_1.actives;

import android.os.Bundle;


import androidx.fragment.app.FragmentActivity;

import com.gouzhong1223.androidtvtset_1.R;
import com.gouzhong1223.androidtvtset_1.banner.adapter.ImageAdapter;
import com.gouzhong1223.androidtvtset_1.banner.bean.BannerDataBean;
import com.youth.banner.Banner;
import com.youth.banner.indicator.CircleIndicator;

public class SusheActivity extends FragmentActivity {

    private Banner banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushe);
        initView();
    }

    private void initView() {
        banner = findViewById(R.id.banner);
        useBanner();
    }

    /**
     * 播放轮播图
     */
    public void useBanner() {
        //添加生命周期观察者
        banner.addBannerLifecycleObserver(this)
                .setAdapter(new ImageAdapter(BannerDataBean.getTestData()))
                .setIndicator(new CircleIndicator(this));
    }
}
