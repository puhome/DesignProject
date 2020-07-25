package com.brzt.design.abstractFactory;

import com.brzt.design.abstractFactory.impl.FirstFarmFactory;
import com.brzt.design.abstractFactory.impl.SecondFarmFactory;
import com.brzt.design.abstractFactory.interf.Animal;
import com.brzt.design.abstractFactory.interf.FarmFactory;
import com.brzt.design.abstractFactory.interf.Plant;
import org.junit.Test;

/**
 * @author puhome
 * @data 2020/7/25
 */
public class FarmTest {

    @Test
    public  void  firstFactoryTest(){
        FarmFactory farmFactory=new FirstFarmFactory();
        Animal animal=farmFactory.createAnimalFactory();
        Plant plant=farmFactory.createPlantFactory();
        animal.getInfo();
        plant.getInfo();
    }

    @Test
    public  void  secondFactoryTest()
    {
        FarmFactory farmFactory=new SecondFarmFactory();
        Animal animal=farmFactory.createAnimalFactory();
        Plant plant=farmFactory.createPlantFactory();
        animal.getInfo();
        plant.getInfo();
    }
}
