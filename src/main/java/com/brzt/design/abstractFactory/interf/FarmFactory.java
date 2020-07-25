package com.brzt.design.abstractFactory.interf;

/**
 * 农场工厂
 * @author puhome
 * @data 2020/7/25
 */
public interface FarmFactory {
    public Animal createAnimalFactory();
    public Plant createPlantFactory();
}
