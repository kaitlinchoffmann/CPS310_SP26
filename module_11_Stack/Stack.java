public class Stack {
    //    attributes
    public static final int MAX_CAPACITY = 100; // don't need this when implementing stack with ArrayList
    Object[] data; // used to create stack
    private int top = -1; // keeps track of last object in stack. default is empty, so -1.

//    constructors
    public Stack() { // creates an empty Stack object
        data = new Object[MAX_CAPACITY]; // this initializes data with size of 100
    }

    public Stack(Object[] data) { // fixed size other than MAX_CAPACITY
        this.data = data;
        top = data.length - 1;
    }

    public Object peek() {
        if(isEmpty()) {
            System.err.println("Stack is empty");
            System.exit(0);
        }
        return data[top];
    }

//    methods
    public boolean isEmpty() {
        return top <= -1;
//        if(top <= -1){
//            return true;
//        } else {
//            return false;
//        }
    }

    public void push(Object obj) {
        if(top+1 < data.length) {
            top++;
            data[top] = obj;
        } else {
            System.err.println("Stack is at max capacity");
            System.exit(0);
        }
    }

    public Object pop() {
        if(isEmpty()) {
            System.err.println("Stack is empty. Nothing to remove.");
            System.exit(0);
        }
/*      top--; // this will work, but will keep the object in the array still. Can lead to memory leaks, degrades performance, can get an OutOfMemoryError overtime
        return data[top+1];*/
        Object obj = data[top];
        data[top] = null;
        top--;
        return obj;
    }

//    toString method
    public String toString() {
        String result = "[";
        for(int i = 0; i<=top; i++) {
            result+=data[i] + " ";
        }
        return result+="]";
    }
}
