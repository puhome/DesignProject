package com.brzt.design.factoryMethod.impl;

import com.brzt.design.factoryMethod.entity.Product;
import com.brzt.design.factoryMethod.interf.BasePay;
import com.brzt.design.factoryMethod.interf.PayCallBack;

/**
 * 微信支付
 * @author puhome
 * @data 2020/7/25
 */
public class WechatPay implements BasePay {
    public void pay(long orderId, Product product, PayCallBack payCallBack) {
        System.out.println("微信支付");
        payCallBack.paySuccess(orderId);
    }
}
