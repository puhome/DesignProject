package com.brzt.design.proto;

import com.brzt.design.proto.entity.Card;
import com.brzt.design.proto.impl.Circle;
import com.brzt.design.proto.impl.Square;
import com.brzt.design.proto.interf.Shape;
import org.junit.Test;

/**
 * @author puhome
 * @data 2020/7/25
 */
public class ShapeTest {
    @Test
    public void graduationCardTest() {
        Card card=new Card();
        card.setName("puhome");
        card.setCommonInfo("恭喜您，于2020-7-25在我校毕业");
        card.setNumber(202007251);

        GraduationCard graduationCard=new GraduationCard(card);
        graduationCard.printInfo();

        GraduationCard graduationCard1=(GraduationCard) graduationCard.clone();
        card.setName("xiaoxiao");
        card.setNumber(202007252);
        graduationCard1.printInfo();
    }

    public static  void  main(String[] args)
    {
        ProtoManager protoManager=new ProtoManager();
        protoManager.addShape("circle",new Circle());
        protoManager.addShape("square",new Square());

        Shape shape=protoManager.getShape("circle");
        shape.countArea();

        Shape shape1=protoManager.getShape("square");
        shape1.countArea();
    }
}
