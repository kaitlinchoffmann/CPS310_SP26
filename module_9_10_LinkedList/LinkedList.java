public class LinkedList<E> {
//    attribute
    Node<E> head; // keeps track of start of the linked list. head has access to all methods in the Node class.

    //    constructors
    public LinkedList() {
        this(null);
    }
    public LinkedList(Node<E> head) {
        this.head = head;
    }

    //    get and set methods
    public Node<E> getHead() {
        return head;
    }
    public void setHead(Node<E> head) {
        this.head = head;
    }

//  other  methods
// isEmpty()
    public boolean isEmpty() {
        if(head == null) {
            return true;
        }
        return false;
    }

//    getLast method
    public Node<E> getLast() {
        if(isEmpty()) {
            return null;
        }
//        ["HELLO", "BYE", "OMG", "WOW"]
//        head = "HELLO"
        Node<E> last = head;
        while(last.getNext() != null) {
            last = last.getNext();
        }
        return last;
    }

//    add node to end of LinkedList
    public void add(Node<E> n) {
        if(isEmpty()) {
            setHead(n);
        } else {
          Node<E> last = getLast();
          last.setNext(n);
          n.setPrevious(last);
        }
    }

    public void addFirst(Node<E> n) {
        if(isEmpty()) {
           setHead(n);
        } else {
            n.setNext(head);
            setHead(n);
        }
    }

//    size method -> returns how many nodes in LL
    public int size() {
        if(isEmpty()) {
            return 0;
        }
        int count = 1;
        Node<E> currentNode = head;
        while(currentNode.getNext() != null) {
            count++;
            currentNode = currentNode.getNext();
        }
        return count;
    }

//    toString method
    public String toString() {
        if(isEmpty()) {
            return "[]";
        }
        String result = "[";
        // ["HELLO", "BYE", "OMG", "WOW"]
        Node<E> currentNode = head; // "HELLO"
        while(currentNode.getNext() != null) {
            result += currentNode.getData() + " ";
            currentNode = currentNode.getNext();
        }
        return result + " " + currentNode.getData() + "]";
    }

}
