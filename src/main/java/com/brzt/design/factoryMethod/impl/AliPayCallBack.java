package com.brzt.design.factoryMethod.impl;

import com.brzt.design.factoryMethod.interf.PayCallBack;

/**
 * 支付宝支付回调
 * @author puhome
 * @data 2020/7/25
 */
public class AliPayCallBack implements PayCallBack {
    public void paySuccess(long orderId) {
        System.out.println("支付宝支付成功:"+orderId);
    }

    public void payFailed() {
        System.out.println("支付宝支付失败");
    }
}
