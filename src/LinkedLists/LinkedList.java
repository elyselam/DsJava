package LinkedLists;

public class LinkedList<E> implements ListI<E> {

    //inner class to restrict access
    class Node<E> {
        E data;
        Node<E> next;
        public Node(E obj) {
            data = obj;
            next = null;
        }
    }
    private Node<E> head;
    private int currentSize; //O(1) access to size of list, w/out it, we have O(n)

    public LinkedList(){
        head = null;
        currentSize = 0;
    }
    /*
    boundary conditions:
    emptying
    finding single element
    adding/removing from front
    adding/removing from end
    working in middle
      */





}
