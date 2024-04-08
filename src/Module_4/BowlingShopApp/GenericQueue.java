package Module_4.BowlingShopApp;

import java.util.LinkedList;

/*
    Daw, Tuhin(2024), CIS-505 Intermediate Java Programming. Bellevue University, all rights reserved.
    Generic queue class
 */
public class GenericQueue<E> {

    private LinkedList<E> list = new LinkedList<E>();

    /**
     *
     * @param item -> adds an item at the beginning of the queue
     */
    public void enqueue (E item) {
        list.addFirst(item);
    }

    /**
     *
     * @return the fist element that has been removed from the queue
     */
    public E dequeue () {
        return list.removeFirst();
    }

    /**
     * Return size of the queue
     */
    public int size () {
        return list.size();
    }
}
