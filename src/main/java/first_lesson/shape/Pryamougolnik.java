package first_lesson.shape;

import first_lesson.Shape;
import first_lesson.exception.InvalidInputException;
import lombok.Getter;
import lombok.NonNull;

@Getter
public class Pryamougolnik implements Shape {
    @NonNull private final double a;
    @NonNull private final double b;
    public Pryamougolnik(double a, double b) {
        assert a >0: new InvalidInputException();
        assert b >0: new InvalidInputException();
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSquare() {
        return a*b;
    }

    @Override
    public String getName() {
        return "Pryamougolnik";
    }

    @Override
    public String getResultOfCalculatingSquare() {
        return getName() + " with sides = " + getA() + " and "+getB() + " has square = " + calculateSquare();

    }

}
