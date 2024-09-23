package first_lesson.shape;

import first_lesson.Shape;
import first_lesson.exception.InvalidInputException;
import lombok.Getter;

import java.util.logging.Logger;

@Getter
public class Kvadrat implements Shape {
    private final double a;

    public Kvadrat(double a) {
        assert a >0: new InvalidInputException("Kvadrat");
        this.a = a;
    }


    @Override
    public double calculateSquare() {
        return a*a;
    }

    @Override
    public String getName() {
        return "Kvadrat";
    }

    @Override
    public String getResultOfCalculatingSquare() {
        return getName() + " with side = " + getA() + " has square = " + calculateSquare();
    }

}
