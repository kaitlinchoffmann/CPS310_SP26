import java.util.LinkedList;

public class Queue<E> {
//    attributes
    private LinkedList<E> data;

//    constructors
    public Queue() {
        data = new LinkedList<>(); // []
    }
    public Queue(LinkedList<E> data) {
        this.data = data;
    }

//    methods
    public boolean isEmpty() {
        if(data.isEmpty()) {
            return true;
        }
        return false;
//        return data.isEmpty(); // could do in one line as well
    }

    public E peek() throws QueueEmptyException {
        if(isEmpty()) {
            throw new QueueEmptyException();
        }
        return data.getFirst();
    }

    public void add(E e) {
        data.add(e);
    }

    public E remove() throws QueueEmptyException {
        if(isEmpty()) {
            throw new QueueEmptyException();
        }
        return data.remove();
    }

    public String toString() {
        return data.toString();
    }
}

class QueueEmptyException extends Exception {
    public QueueEmptyException() {
        System.err.println("Queue is empty!!");
    }
}