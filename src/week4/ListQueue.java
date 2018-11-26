package week4;


import java.util.EmptyStackException;


public class ListQueue extends LinkedList {

    public ListQueue() {    // <== constructor, different from ListStackComp.java
        super();
    }

    public boolean empty() {
        return isEmpty();
    }

    public Object enqueue(Object item) {
        addToTail(item);
        return item;
    }

    public Object dequeue() {
        return removeFromHead();
    }

    public String toString() {
        String str = "[ ";
        ListNode current = head;
        while (current != null) {
            str = str + current.getData() + " ";
            current = current.getNext();
        }
        return str + " ]";
    }
}