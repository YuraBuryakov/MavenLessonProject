package first_lesson.exception;

public class InvalidInputException extends IllegalArgumentException{
    public InvalidInputException(){
        super("The argument cannot be less or equal 0");
    }

    public InvalidInputException(String nameOfShape){
        super("The argument for " + nameOfShape + " cannot be less or equal 0");
    }

    public InvalidInputException(String nameOfShape, String nameOfSide){
        super("The argument " + nameOfSide + "for " + nameOfShape + " cannot be less or equal 0");
    }
}
