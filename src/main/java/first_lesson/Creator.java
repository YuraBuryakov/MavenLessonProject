package first_lesson;

import first_lesson.collections.CircularLinkedList;
import first_lesson.factory.ShapeFactory;

import java.util.ArrayList;

import java.util.Random;

public class Creator {
    ArrayList<Shape> shapes = new ArrayList<>();
    private ShapeFactory shapeFactory;
    private int count;
    private CircularLinkedList<Shape> circularLinkedList = new CircularLinkedList<>();

    public Creator(ShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    /**
     * method creates random shape by shapeFactory and return array list of Shape,
     * @param quantity - defines a quantity for generating shapes
     */
    public ArrayList<Shape> create (int quantity){
        if (quantity > 0){
            Random random = new Random();
            for (int i = 0 ; i < quantity; i ++){

                Shape shape = shapeFactory.next(random.nextInt(4) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
                shapes.add(shape);
            }
        }

        return shapes;
    }
    /**
     * method returns shape by id. In methods are used shape factory for creating shapes with random sizes of and added in circularLinkedList
     * @param index - defines a quantity for generating shapes
     */
    public Shape next ( int index){
        assert index >=0 : "The index cannot be less then 0";
        if (index >= 0 ){
            Random random = new Random();
            for (int i = 0 ; i < 4; i ++){

                Shape shape = shapeFactory.next(i + 1 ,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
                circularLinkedList.add(shape);
            }
        }
        return circularLinkedList.next(index);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
