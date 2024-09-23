package first_lesson;

import first_lesson.factory.ShapeFactory;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//        todo add basic javadoc - done
//        todo test for factory, creator and 2 shapes
//        todo create own illegal  exception
//        ShapeFactory shapeFactory = new ShapeFactory();
//        Creator creator = new Creator(shapeFactory);
//        ArrayList<Shape> shapes = creator.create(10);
//        shapes.stream().map(Shape::getResultOfCalculatingSquare).forEach(System.out::println);

//        next lesson
//        new LinkedList<>().add();
//        remove();
//        iterator();
//        size();
//        get();

//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(new Integer(3));
//        integers.add(new Integer(5));
//        integers.add(new Integer(8));

        /* next method is tested in CreatorTest*/
        ShapeFactory shapeFactory = new ShapeFactory();
        Creator creator = new Creator(shapeFactory);
        Shape shape = creator.next(0);
        System.out.println(shape.getResultOfCalculatingSquare());

    }

}
