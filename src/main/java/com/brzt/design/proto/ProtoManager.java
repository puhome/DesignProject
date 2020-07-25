package com.brzt.design.proto;

import com.brzt.design.proto.interf.Shape;

import java.util.HashMap;

/**
 * 原型模式管理
 * @author puhome
 * @data 2020/7/25
 */
public class ProtoManager {
    private HashMap<String, Shape> hashMap=new HashMap<String, Shape>();

    /**
     * 添加hashmap
     * @param string
     * @param shape
     */
    public void addShape(String string,Shape shape)
    {
        hashMap.put(string,shape);
    }

    public Shape getShape(String string)
    {
        Shape shape=hashMap.get(string);
        return  (Shape) shape.clone();
    }
}
