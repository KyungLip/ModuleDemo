package com.lp.module_base;

import android.content.Context;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2612:06
 * Email   :kyunglip1314@163.com
 * Description:
 */
public class CommonUtils {

    private static Context context;

    private CommonUtils() {
        throw new UnsupportedOperationException("Can not create this object!");
    }

    public static void initApplicationContext(Context c) {
        context = c.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
