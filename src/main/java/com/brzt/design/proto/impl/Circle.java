package com.brzt.design.proto.impl;

import com.brzt.design.proto.interf.Shape;

import java.util.Scanner;

/**
 * 圆形
 * @author puhome
 * @data 2020/7/25
 */
public class Circle implements Shape {
    public Object clone() {
        Circle circle=null;
        try {
            circle=(Circle)super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("克隆圆异常");
            e.printStackTrace();
        }
        return circle;
    }

    public void countArea() {
        int r=0;
        System.out.println("请输入圆的半径:");
        Scanner scanner=new Scanner(System.in);
        r=scanner.nextInt();
        System.out.println("圆的面积为："+3.14*r*r);
    }
}
