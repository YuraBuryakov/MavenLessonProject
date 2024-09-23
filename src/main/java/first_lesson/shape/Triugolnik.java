package first_lesson.shape;

import first_lesson.Shape;
import first_lesson.exception.InvalidInputException;
import lombok.Getter;

@Getter
public class Triugolnik implements Shape {

    private final double a;
    private final double b;
    public Triugolnik(double a, double b) {
        assert a >0: new InvalidInputException();
        assert b >0: new InvalidInputException();
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSquare() {
        return a*b/2;
    }

    @Override
    public String getName() {
        return "Triugolnik";
    }

    @Override
    public String getResultOfCalculatingSquare() {
        return getName() + " with sides = " + getA() + " and "+getB() + " has square = " + calculateSquare();

    }
}
