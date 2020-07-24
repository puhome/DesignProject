package com.brzt.design.factory.impl;

import com.brzt.design.factory.Activity;

/**
 * 抽奖功能
 * @author puhome
 * @data 2020/7/24
 */
public class Lottery implements Activity {
    public void action() {
        System.out.println("抽奖");
    }
}
