package com.lp.module_base.service.module_contact_service;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * @author :LiuPeng
 * Date    : 2019-07-2615:26
 * Email   :kyunglip1314@163.com
 * Description:
 */
public interface IContactService extends IProvider {
    boolean printContactMsg(String msg);
}
