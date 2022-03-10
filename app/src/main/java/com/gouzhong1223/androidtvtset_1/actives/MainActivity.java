package com.gouzhong1223.androidtvtset_1.actives;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gouzhong1223.androidtvtset_1.R;

import java.util.HashMap;

public class MainActivity extends Activity {

    /**
     * 用于缓存USB设备的Map
     */
    public HashMap<String, UsbDevice> deviceList = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initUsb();
    }

    /**
     * 初始化USB设备
     */
    private void initUsb() {
        UsbManager manager = (UsbManager) getSystemService(Context.USB_SERVICE);
        deviceList = manager.getDeviceList();
    }

    /**
     * 初始化View
     */
    private void initView() {
        View.OnFocusChangeListener onFocusChangeListener = (view, b) -> {
            if (b) {
                view.setScaleX(1.4f);
                view.setScaleY(1.4f);
                view.bringToFront(); //此属性是将view添加到最上层
            } else {
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        };
        Button button1 = findViewById(R.id.button1);
        button1.setOnFocusChangeListener(onFocusChangeListener);
        Button button2 = findViewById(R.id.button2);
        button2.setOnFocusChangeListener(onFocusChangeListener);
    }


    /**
     * 组件的点击绑定事件
     *
     * @param view 组件
     */
    @SuppressLint("NonConstantResourceId")
    public void onclick(View view) {
        Intent intent = new Intent();
        switch (view.getId()) {
            case R.id.button1:
                intent.setClass(MainActivity.this, SusheActivity.class);
                startActivity(intent);
                break;
            case R.id.button2:
                intent.setClass(MainActivity.this, CarouselActivity.class);
                startActivity(intent);
                break;
        }
    }
}
