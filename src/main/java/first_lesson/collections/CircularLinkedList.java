package first_lesson.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class CircularLinkedList<T> implements Iterable<T>{
    private Node<T> head = null;
    private Node<T> tail = null;
    private int size = 0;

    /** Add a node to the end of the circular linked list **/
    public void add(T data) {
        Node<T> newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }

        tail = newNode;
        tail.next = head;

        size ++;
    }

    // Get the data at the specified index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }

        Node<T> current = head;
        int count = 0;

        while (count < index) {
            current = current.next;
            count++;
        }

        return current.data;
    }

    public void remove(T data) {
        if (head == null) {
            return;
        }
                Node<T> parent = null;
                Node<T> current = head;
                int count = 0;

                while (count < size) {
                    if (current.data == data) {
                        parent.next = current.next;
                        break;
                    }
                    parent = current;
                    current = current.next;
                    count++;
                }


            size --;

    }

    public int size(){
        return size;
    }

    public T next (int index) {
        if (index == 0){
            return head.data;
        }
        int realIndex = index % size;
        Node<T> current = head;
        int count = 0;
        while ( count < realIndex){
            current = current.next;
            count++;
        }
        return current.data;
    }

    @Override
    public Iterator<T> iterator() {
        return  new CircularLinkedListIterator();    }

    private class CircularLinkedListIterator implements Iterator<T> {
        private Node<T> current = head;
        private boolean firstPass = true;

        @Override
        public boolean hasNext() {
            return current != null && (firstPass || current != head);
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            T data = current.data;
            current = current.next;
            firstPass = false;
            return data;
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
