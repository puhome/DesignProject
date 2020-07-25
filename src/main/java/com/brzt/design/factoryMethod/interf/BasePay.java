package com.brzt.design.factoryMethod.interf;

import com.brzt.design.factoryMethod.entity.Product;
/**
 * 支付接口
 * @author puhome
 * @data 2020/7/25
 */
public interface BasePay {
    void pay(long orderId,Product product,PayCallBack payCallBack);
}
