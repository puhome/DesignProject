package com.brzt.design.factoryMethod;

import com.brzt.design.factoryMethod.entity.Product;
import com.brzt.design.factoryMethod.impl.AliPayCallBack;
import com.brzt.design.factoryMethod.impl.AliPayFactory;
import com.brzt.design.factoryMethod.impl.WechatPayCallBack;
import com.brzt.design.factoryMethod.impl.WechatPayFactory;
import com.brzt.design.factoryMethod.interf.BasePay;
import com.brzt.design.factoryMethod.interf.PayFactory;
import org.junit.Test;

/**
 * @author puhome
 * @data 2020/7/25
 */
public class PayTest {

    @Test
    public void wechatPayTest() {
        PayFactory payFactory = new WechatPayFactory();
        BasePay basePay = payFactory.createPay();
        Product product = new Product();
        product.setId(1);
        product.setName("宝马");

        WechatPayCallBack wechatPayCallBack = new WechatPayCallBack();
        basePay.pay(202007251, product, wechatPayCallBack);
    }

    @Test
    public void aliPayTest() {
        PayFactory payFactory = new AliPayFactory();
        BasePay basePay = payFactory.createPay();
        Product product = new Product();
        product.setId(2);
        product.setName("奔驰");

        AliPayCallBack aliPayCallBack = new AliPayCallBack();
        basePay.pay(202007252, product, aliPayCallBack);
    }
}
