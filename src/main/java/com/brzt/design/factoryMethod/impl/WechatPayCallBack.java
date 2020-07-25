package com.brzt.design.factoryMethod.impl;

import com.brzt.design.factoryMethod.interf.PayCallBack;

/**
 * 微信支付回调
 * @author puhome
 * @data 2020/7/25
 */
public class WechatPayCallBack implements PayCallBack {
    public void paySuccess(long orderId) {
        System.out.println("微信支付成功："+orderId);
    }

    public void payFailed() {
        System.out.println("微信支付失败");
    }
}
