package com.lp.module_base;

import android.app.Application;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2612:06
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class BaseApplication extends Application {
    protected static BaseApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        CommonUtils.initApplicationContext(this);
    }

    public static BaseApplication getInstance() {
        return instance;
    }
}
