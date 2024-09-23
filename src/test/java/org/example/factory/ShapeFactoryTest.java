package org.example.factory;

import first_lesson.Shape;
import first_lesson.factory.ShapeFactory;
import first_lesson.shape.Pryamougolnik;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.assertThat;


public class ShapeFactoryTest {
    private ShapeFactory shapeFactory;

    @Before
    public void setUp(){
        shapeFactory = new ShapeFactory();
    }



    @Test
    public void nextCheckFirstRandomShape(){
        Shape shape = shapeFactory.next(1,1,1);
        Shape pryamougolnik = new Pryamougolnik(1,1);
        assertEquals("the same square", (int)shape.calculateSquare(), (int)pryamougolnik.calculateSquare());
    }

   @Test
    public void next(){
        assertThat(shapeFactory.next(1,1,1)).isNotNull().
                isInstanceOf(Shape.class);
        assertThat(shapeFactory.next(2,1,1)).isNotNull().
               isInstanceOf(Shape.class);
        assertThat(shapeFactory.next(3,1,1)).isNotNull().
               isInstanceOf(Shape.class);
        assertThat(shapeFactory.next(4,1,1)).isNotNull().
               isInstanceOf(Shape.class);
   }

}
