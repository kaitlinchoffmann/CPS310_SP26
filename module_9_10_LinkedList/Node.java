public class Node<E> {
//    attributes
    private E data;   // hold the object, such as String
    private Node<E> next; // connecting the next Node that this Node is attached to
    private Node<E> previous; // previus allows us to go backwards and implement a doubly LinkedList
    
    //constructors
    public Node() {
        this(null, null, null);
//        this.data = null;
//        this.next = null;
    }

    public Node(E data) {
        this(data, null, null);
    }

    public Node(E data, Node<E> next) {
        if(checkData(data)) {
            this.data = data;
            this.next = next;
            this.previous = null;
        } else {
            System.err.println("Data not valid!!!! >:)");
        }
    }

    public Node(E data, Node<E> next, Node<E> previous) {
        this(data, next);
        this.previous = previous;
    }

//    methods
    public boolean checkData(E data) {
        return true;
    }
    //    get methods
    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPrevious() {
        return previous;
    }

    //    set methods
    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setPrevious(Node<E> previous) {
        this.previous = previous;
    }

    public void setData(E data) {
        this.data = data;
    }
    public String toString() {
        return data.toString();
    }
}
