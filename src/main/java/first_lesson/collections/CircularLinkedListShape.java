//package first_lesson.collections;
//
//import first_lesson.Shape;
//
//import java.util.Iterator;
//import java.util.NoSuchElementException;
//
//public class CircularLinkedListShape implements Iterable<Integer>{
//    private Node head = null;
//    private Node tail = null;
//    private int size = 0;
//
//    /** Add a node to the end of the circular linked list **/
//    public void add(Shape data) {
//        Node<Shape> newNode = new Node(data);
//
//        if (head == null) {
//            head = newNode;
//        } else {
//            tail.next = newNode;
//        }
//
//        tail = newNode;
//        tail.next = head;
//
//        size ++;
//    }
//
//    // Get the data at the specified index
//    public Shape get(int index) {
//        if (index < 0 || index >= size) {
//            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
//        }
//
//        Node current = head;
//        int count = 0;
//
//        while (count < index) {
//            current = current.next;
//            count++;
//        }
//
//        return current.data;
//    }
//
//    public void remove(int data) {
//        if (head == null) {
//            return;
//        }
//
//
//        Node parent = null;
//        Node current = head;
//        int count = 0;
//
//        while (count < size) {
//            if (current.data == data) {
//                parent.next = current.next;
//                break;
//            }
//            parent = current;
//            current = current.next;
//            count++;
//        }
//
//
//        size --;
//
//    }
//
//    public int size(){
//        return size;
//    }
//
//    public int next (int index) {
//        int realIndex = index % size;
//        Node current = head;
//        int count = 0;
//        while ( count < realIndex){
//            current = current.next;
//            count++;
//        }
//        return current.data;
//    }
//
//    @Override
//    public Iterator<Integer> iterator() {
//        return new CircularLinkedList.CircularLinkedListIterator();    }
//
//    private class CircularLinkedListIterator implements Iterator<Integer> {
//        private Node current = head;
//        private boolean firstPass = true;
//
//        @Override
//        public boolean hasNext() {
//            return current != null && (firstPass || current != head);
//        }
//
//        @Override
//        public Integer next() {
//            if (!hasNext()) {
//                throw new NoSuchElementException();
//            }
//
//            int data = current.data;
//            current = current.next;
//            firstPass = false;
//            return data;
//        }
//
//        @Override
//        public void remove() {
//            throw new UnsupportedOperationException("Remove not supported");
//        }
//    }
//}
