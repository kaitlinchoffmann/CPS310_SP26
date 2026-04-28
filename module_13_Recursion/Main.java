public class Main {
    public static void main(String[] args) {
        printRecursively(5); // 1 2 3 4 5
        
        printBackwards(5);

        printString("dogs", 5);

        int sum = sumRecursively(5); // 1 + 2 + 3 + 4 + 5 = 15
        System.out.println("Sum = " + sum);

        int sumPower = sumRaiseToPower(2, 4);
        System.out.println("Sum = " + sumPower);

        int factorial = getFactorial(7);
        System.out.println("factorial of 7 = " + factorial);

//        1 * 2 * 3 * 4 * 5 * 6 * 7
        displayChars("horse");

        int count = upperCaseCount("badPassword");
        System.out.println("Amount of upper case letters: " + count);

    }

//    Example 6: write a method that counts how many Upper case letters are in a String (like for a password)
    public static int upperCaseCount(String password) {
//        base case
        if(password.length() == 0) {
            return 0;
        }
//        general case
        if(Character.isUpperCase(password.charAt(0))) {
            return 1 + upperCaseCount(password.substring(1));
        }
        return upperCaseCount(password.substring(1));
    }

//    Example 5: recursively display a string 1 character per line
    public static void displayChars(String s) {
//        base case
        if(s.length() == 0) {
            return;
        }
//        general case
        System.out.println(s.charAt(0));
        displayChars(s.substring(1));
    }

//    Example 4
    public static int getFactorial(int n) {
//        base case
        if(n == 0) {
            return 1;
        }
//        general case
        return n * getFactorial(n-1);
    }

//    Example 4
//    recursively sum x to the nth power (x^n) starting with n = 0
    public static int sumRaiseToPower(int x, int n) {
//        base case
        if(n == 0) {
            return 1; //anything raised to the 0 power is 1
        }
//        general case
        return (int)Math.pow(x, n) + sumRaiseToPower(x, n - 1);
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
    }
}