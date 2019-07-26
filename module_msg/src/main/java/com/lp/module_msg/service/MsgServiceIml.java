package com.lp.module_msg.service;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.lp.module_base.CommonUtils;
import com.lp.module_base.service.module_msg_service.IMsgService;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2615:12
 * Email   :kyunglip1314@163.com
 * Description:
 */
@Route(path = "/msgservicegroup/msgservice", name = "消息打印服务")
public class MsgServiceIml implements IMsgService {
    @Override
    public boolean printMsg(String msg) {
        Log.e("MsgServiceIml", msg);
        Toast.makeText(CommonUtils.getContext(), msg, Toast.LENGTH_SHORT).show();
        return true;
    }

    @Override
    public void init(Context context) {

    }
}
