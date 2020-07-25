package com.brzt.design.proto.entity;

/**
 * 毕业证书属性
 * @author puhome
 * @data 2020/7/25
 */
public class Card {
    private String name;
    private int number;
    private String commonInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCommonInfo() {
        return commonInfo;
    }

    public void setCommonInfo(String commonInfo) {
        this.commonInfo = commonInfo;
    }
}
