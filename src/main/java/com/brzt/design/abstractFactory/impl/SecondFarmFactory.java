package com.brzt.design.abstractFactory.impl;

import com.brzt.design.abstractFactory.interf.Animal;
import com.brzt.design.abstractFactory.interf.FarmFactory;
import com.brzt.design.abstractFactory.interf.Plant;

/**
 * 第二农场
 * @author puhome
 * @data 2020/7/25
 */
public class SecondFarmFactory implements FarmFactory {
    public Animal createAnimalFactory() {
        System.out.println("第二农场养猫");
        return new Cat();
    }

    public Plant createPlantFactory() {
        System.out.println("第二农场种香蕉");
        return new Banana();
    }
}
