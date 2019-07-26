package com.lp.module_base.service.module_my_service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2615:27
 * Email   :kyunglip1314@163.com
 * Description:
 */
public interface IMyService extends IProvider {
    boolean printMyMsg(String msg);
}
