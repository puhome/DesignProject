package com.brzt.design.factoryMethod.interf;

/**
 * 支付回调接口
 * @author puhome
 * @data 2020/7/25
 */
public interface PayCallBack {
    /**
     * 支付成功
     * @param orderId
     */
    void paySuccess(long orderId);

    /**
     * 支付失败
     */
    void payFailed();
}
