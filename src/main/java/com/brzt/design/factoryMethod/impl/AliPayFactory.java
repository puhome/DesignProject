package com.brzt.design.factoryMethod.impl;

import com.brzt.design.factoryMethod.interf.BasePay;
import com.brzt.design.factoryMethod.interf.PayFactory;

/**
 * 支付宝工厂实现
 * @author puhome
 * @data 2020/7/25
 */
public class AliPayFactory implements PayFactory {

    public BasePay createPay() {
        return new AliPay();
    }
}
