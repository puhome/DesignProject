package com.brzt.design.abstractFactory.impl;

import com.brzt.design.abstractFactory.interf.Plant;

/**
 * @author puhome
 * @data 2020/7/25
 */
public class Apple implements Plant {
    public void getInfo() {
        System.out.println("苹果");
    }
}
