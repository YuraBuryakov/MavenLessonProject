package org.example;

import first_lesson.Creator;
import first_lesson.Shape;
import first_lesson.factory.ShapeFactory;
import first_lesson.shape.Kvadrat;
import first_lesson.shape.Pryamougolnik;
import first_lesson.shape.Triugolnik;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.assertj.core.api.Assertions.assertThat;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class CreatorTest {
    Creator creator;

    @Before
    public void setUp(){
        creator = new Creator(new ShapeFactory());
    }

    @Test
    public void create(){
        assertThat(creator.create(7).get(0)).isNotNull()
                .isInstanceOf(Shape.class);
        assertThat(creator.create(7)).isNotNull()
                .isInstanceOf(ArrayList.class);
    }
    @Test
    public void next(){
        assertThat(creator.next(0).getName()).isNotNull()
                        .isEqualTo("Pryamougolnik");
        assertThat(creator.next(1).getName()).isNotNull()
                .isEqualTo("Triugolnik");
        assertThat(creator.next(2).getName()).isNotNull()
                .isEqualTo("Kvadrat");
        assertThat(creator.next(3).getName()).isNotNull()
                .isEqualTo("Krug");
        assertThat(creator.next(4).getName()).isNotNull()
                .isEqualTo("Pryamougolnik");
        assertThat(creator.next(5).getName()).isNotNull()
                .isEqualTo("Triugolnik");
        assertThat(creator.next(6).getName()).isNotNull()
                .isEqualTo("Kvadrat");
        assertThat(creator.next(7).getName()).isNotNull()
                .isEqualTo("Krug");

    }
}
