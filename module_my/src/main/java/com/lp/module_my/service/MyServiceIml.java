package com.lp.module_my.service;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lp.module_base.CommonUtils;
import com.lp.module_base.service.module_my_service.IMyService;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2615:28
 * Email   :kyunglip1314@163.com
 * Description:
 */
@Route(path = "/myservicegroup/myservice", name = "个人中心服务")
public class MyServiceIml implements IMyService {
    @Override
    public boolean printMyMsg(String msg) {
        Log.e("ContactServiceIml", msg);
        Toast.makeText(CommonUtils.getContext(), msg, Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void init(Context context) {

    }
}
