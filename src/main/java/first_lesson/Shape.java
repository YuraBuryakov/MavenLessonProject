package first_lesson;

public interface Shape {

    /**
     * returns a calculated square of a shape
     */
    double calculateSquare();

    /**
     * returns a name of a shape
     */
    String getName();

    /**
     * returns a String with name of shape, values of sides of shape
     * and a calculated square
     */
    String getResultOfCalculatingSquare();
}
