package org.example.shape;
import first_lesson.Shape;
import first_lesson.shape.Krug;
import lombok.Getter;
import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class KrugTest {
    private Shape shape ;

    @Before
    public void setUp(){
        shape = new Krug(1);
    }

    @Test
    public void getResultOfCalculatingSquare(){
        assertThat(shape.getResultOfCalculatingSquare()).isNotEmpty()
                .isNotEmpty();
    }

    @Test
    public void calculateSquare(){
        assertThat(shape.calculateSquare()).isNotNull()
                .isEqualTo(Math.PI);
    }

    @Test
    public void getName(){
        assertThat(shape.getName()).isNotNull()
                .isNotEmpty()
                .isEqualTo("Krug");
    }

    @Test
    public void checkPI(){
        assertThat(Krug.getPI()).isNotNull()
                .isEqualTo(Math.PI);
    }

}
