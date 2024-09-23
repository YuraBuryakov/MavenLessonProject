package first_lesson.collections;

import lombok.ToString;


public class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

}
