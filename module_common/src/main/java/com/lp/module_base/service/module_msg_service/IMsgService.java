package com.lp.module_base.service.module_msg_service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2615:10
 * Email   :kyunglip1314@163.com
 * Description:
 */
public interface IMsgService extends IProvider {
    boolean printMsg(String msg);
}
