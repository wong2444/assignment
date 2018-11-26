package week4;

import java.util.EmptyStackException;

public class ListStack extends LinkedList {

    public ListStack() {    // <== constructor, different from ListStackComp.java
        super();
    }

    public boolean empty() {
        return isEmpty();
    }

    public Object push(Object item) {
        addToTail(item);
        return item;
    }

    public Object pop() {
        return removeFromTail();
    }

    public Object peek() {
        return get(length);
    }

    public int search(Object item) {
        int c = 0;
        ListNode current = head;
        while (current != null) {
            c++;
            if (current.getData().equals(item)) {
                return c;
            }
            current = current.getNext();

        }
        if (c >= count()) {
            c = -1;// -1 mean cannot find the item
        }
        return c;

    }
}