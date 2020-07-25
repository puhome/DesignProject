package com.brzt.design.abstractFactory.impl;

import com.brzt.design.abstractFactory.interf.Animal;

/**
 * @author puhome
 * @data 2020/7/25
 */
public class Dog implements Animal {
    public void getInfo() {
        System.out.println("狗");
    }
}
