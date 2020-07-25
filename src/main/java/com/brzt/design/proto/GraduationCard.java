package com.brzt.design.proto;

import com.brzt.design.proto.entity.Card;

/**
 * 毕业证书克隆
 * @author puhome
 * @data 2020/7/25
 */
public class GraduationCard implements Cloneable {
    Card card;

    GraduationCard(Card card)
    {
        this.card=card;
    }

    public Object clone(){
        try {
            return  super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return  null;
        }
    }

    public void printInfo()
    {
        System.out.println("姓名："+card.getName()+","+card.getCommonInfo()+","+"证书编号："+card.getNumber());
    }
}
