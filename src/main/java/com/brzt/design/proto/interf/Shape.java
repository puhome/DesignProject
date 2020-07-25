package com.brzt.design.proto.interf;

/**
 * 形状接口，计算面积
 * @author puhome
 * @data 2020/7/25
 */
public interface Shape extends Cloneable {
    public Object clone();//克隆
    public void countArea();//计算面积
}
