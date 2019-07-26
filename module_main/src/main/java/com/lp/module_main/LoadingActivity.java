package com.lp.module_main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.lp.module_base.service.module_msg_service.IMsgService;

public class LoadingActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        findViewById(R.id.btn_to_module_msg).setOnClickListener(this);
        findViewById(R.id.btn_to_module_contact).setOnClickListener(this);

        findViewById(R.id.btn_to_module_my).setOnClickListener(this);
        findViewById(R.id.btn_call_msgservice_printmsg).setOnClickListener(this);
        findViewById(R.id.btn_call_contactservice_printmsg).setOnClickListener(this);
        findViewById(R.id.btn_call_myservice_printmsg).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_to_module_msg) {
            ARouter.getInstance().build("/msg/msgactivity")
                    .withString("msg", "我来自Main-LoadingActivity")
                    .navigation(this);
        } else if (v.getId() == R.id.btn_to_module_contact) {
            ARouter.getInstance().build("/contact/contactactivity").navigation(this);
        } else if (v.getId() == R.id.btn_to_module_my) {
            ARouter.getInstance().build("/my/myactivity").navigation(this);

        } else if (v.getId() == R.id.btn_call_msgservice_printmsg) {
            IMsgService iMsgService = (IMsgService) ARouter.getInstance().build("/msgservicegroup/msgservice").navigation();
            iMsgService.printMsg("组件Main-调用组件Msg的服务了!");
        } else if (v.getId() == R.id.btn_call_contactservice_printmsg) {
            IMsgService iMsgService = (IMsgService) ARouter.getInstance().build("/msgservicegroup/msgservice").navigation();
            iMsgService.printMsg("组件Main-调用组件Contact的服务了!");
        } else if (v.getId() == R.id.btn_call_myservice_printmsg) {
            IMsgService iMsgService = (IMsgService) ARouter.getInstance().build("/msgservicegroup/msgservice").navigation();
            iMsgService.printMsg("组件Main-调用组件My的服务了!");
        }
    }
}
