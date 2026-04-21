public class Main {
    public static void main(String[] args) {
//        printRecursively(5); // 1 2 3 4 5
//        printBackwards(5);
//        printString("dogs", 5);

        int sum = sumRecursively(5); // 1 + 2 + 3 + 4 + 5 = 15
        System.out.println("Sum = " + sum);
    }
//    Example 3
//    Calculate the sum of 1 through n
    public static int sumRecursively(int n) {
        if(n <= 0) {
            return 0;
        }
        return n + sumRecursively(n -1);
    }

 //   Exercise 1
//    print a String n amount of times
    public static void printString(String word, int n) {
//        base case: when to stop/return
        if(n <= 0) {
            return;
        }
//        general case: code to execute, and the recursive call
        printString(word, n - 1);
        System.out.println(word);
    }
    //  Example 1:
//  Create a method that prints 1 through n
    public static void printRecursively(int n) {
//      base case: when to stop calling itself, when to return
        if (n <= 0) {
            return;
        }
//      general what we are trying to do for this program, and recursive call to itself
        printRecursively(n - 1);
        System.out.print(n + " ");
    }

    //  Example 2:
    public static void printBackwards(int n) {
//      base case: when to stop calling itself, when to return
        if (n <= 0) {
            return;
        }
//      general what we are trying to do for this program, and recursive call to itself
        System.out.print(n + " ");
        printBackwards(n - 1);
//        System.out.println("hi: " + n);
    }
}
