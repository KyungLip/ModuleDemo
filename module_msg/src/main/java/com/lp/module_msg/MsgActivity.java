package com.lp.module_msg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;

@Route(path = "/msg/msgactivity")
public class MsgActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.modulemsg_activity_msg);
        findViewById(R.id.btn_msg_close).setOnClickListener(this);
        TextView tvMsgInfo = findViewById(R.id.tv_msg_info);
        Intent intent = getIntent();
        if (intent != null) {
            String msg = intent.getStringExtra("msg");
            if (!TextUtils.isEmpty(msg)) {
                tvMsgInfo.setText(msg);
            }
        }

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_msg_close) {
            finish();
        }
    }
}
