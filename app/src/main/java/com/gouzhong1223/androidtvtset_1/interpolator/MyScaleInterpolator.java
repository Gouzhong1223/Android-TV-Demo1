package com.gouzhong1223.androidtvtset_1.interpolator;

import android.view.animation.Interpolator;

/**
 * @Author : Gouzhong
 * @Blog : www.gouzhong1223.com
 * @Description :
 * @Date : create by QingSong in 2022-03-02 19:46
 * @Email : gouzhong1223@gmail.com
 * @Since : JDK 1.8
 * @PackageName : com.gouzhong1223.androidtvtset_1.interpolator
 * @ProjectName : Android TV Tset-1
 * @Version : 1.0.0
 */
public class MyScaleInterpolator implements Interpolator {

    //弹性因数
    private float factor;

    public MyScaleInterpolator(float factor) {
        this.factor = factor;
    }

    /**
     * 差值器效果级曲线可用http://inloop.github.io/interpolator/  查看
     * factor=0.3
     * pow(2,-10*x)*sin((x-factor/4)*(2*PI)/factor)+1*
     **/
    @Override
    public float getInterpolation(float input) {
        return (float) (Math.pow(2, -10 * input) * Math.sin((input - factor / 4) * (2 * Math.PI) / factor) + 1);
    }
}
