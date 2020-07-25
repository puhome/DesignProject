package com.brzt.design.abstractFactory.impl;

import com.brzt.design.abstractFactory.interf.Animal;
import com.brzt.design.abstractFactory.interf.FarmFactory;
import com.brzt.design.abstractFactory.interf.Plant;

/**
 * 第一农场
 * @author puhome
 * @data 2020/7/25
 */
public class FirstFarmFactory implements FarmFactory {
    public Animal createAnimalFactory() {
        System.out.println("第一农场养狗");
        return new Dog();
    }

    public Plant createPlantFactory() {
        System.out.println("第一农场种苹果");
        return new Apple();
    }
}
