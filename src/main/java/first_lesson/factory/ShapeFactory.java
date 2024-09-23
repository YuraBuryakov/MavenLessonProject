package first_lesson.factory;

import first_lesson.Shape;
import first_lesson.collections.CircularLinkedList;
import first_lesson.exception.InvalidInputException;
import first_lesson.shape.Krug;
import first_lesson.shape.Kvadrat;
import first_lesson.shape.Pryamougolnik;
import first_lesson.shape.Triugolnik;

public class ShapeFactory {
    public ShapeFactory(){

    }

    /**
     * method creates a random shape with random values for a shape by random integer value
     * @param random - the random integer value, which is used for getting a random shape
     * @param a - the value for a side of shape
     * @param b - the value for a side of shape
     * @return random generated shape
     */
    public Shape next(int random, int a, int b){
        {
            assert random > 0 : new InvalidInputException();
            assert a > 0 : new InvalidInputException();
            assert b > 0 : new InvalidInputException();
        }
        switch (random){
            case 1:
                return new Pryamougolnik(a,b);
            case 2:
                return new Triugolnik(a,b);
            case 3 :
                return new Kvadrat(a);
            case 4 :
                return new Krug(a);
            default:
                throw new IllegalArgumentException("" + random);
        }
    }
}
