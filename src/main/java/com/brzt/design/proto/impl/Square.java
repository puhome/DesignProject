package com.brzt.design.proto.impl;

import com.brzt.design.proto.interf.Shape;

import java.util.Scanner;

/**
 * 正方形
 * @author puhome
 * @data 2020/7/25
 */
public class Square implements Shape {
    public Object clone() {
        Square square=null;
        try {
            square=(Square) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("正方形克隆异常");
            e.printStackTrace();
        }
        return square;
    }

    public void countArea() {
        int a=0;
        System.out.println("计算正方形的边长:");
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();
        System.out.println("正方形的面积为："+a*a);
    }
}
