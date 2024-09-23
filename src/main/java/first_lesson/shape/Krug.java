package first_lesson.shape;

import first_lesson.Shape;
import first_lesson.exception.InvalidInputException;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Krug implements Shape {
    @Getter
    private static final double PI = Math.PI;
    private final double r;

    public Krug(double r) {
        assert r > 0: new InvalidInputException();
        this.r = r;
    }

    @Override
    public double calculateSquare() {
        return Math.PI*r*r;
    }

    @Override
    public String getName() {
        return "Krug";
    }

    @Override
    public String getResultOfCalculatingSquare() {
        return getName() + " with radius = " + getR() + " has square = " + calculateSquare();
    }

}
