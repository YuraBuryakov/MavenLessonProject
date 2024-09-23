package org.example;

import first_lesson.collections.CircularLinkedList;
import org.junit.Before;
import org.junit.Test;

public class CircularLinkedListTest {

    CircularLinkedList circularLinkedList;

    @Before
    public void setUp(){
        circularLinkedList = new CircularLinkedList();
    }

    @Test
    public void add(){
        circularLinkedList.add(3);
        circularLinkedList.add(2);
        circularLinkedList.add(5);

        System.out.println("size = ");
        System.out.println(circularLinkedList.get(0));
        System.out.println(circularLinkedList.get(1));
        System.out.println(circularLinkedList.get(2));

        System.out.println(circularLinkedList.size());
//        circularLinkedList.remove(5);
        System.out.println(circularLinkedList.size());
        System.out.println("new list");
        System.out.println(circularLinkedList.get(0));
        System.out.println(circularLinkedList.get(1));
        System.out.println("iterator");
        System.out.println(circularLinkedList.iterator().next());

        System.out.println("next");
        System.out.println(circularLinkedList.next(5));
    }


}
