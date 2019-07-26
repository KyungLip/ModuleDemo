package com.lp.moduledemo;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lp.module_base.BaseApplication;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2612:11
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class MainApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.DEBUG) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(instance);
    }
}
