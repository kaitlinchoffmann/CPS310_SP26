import java.util.*;
public class Main {
   public static void main(String[] args) {

     //  E[] myarr = new E[5]; cannot use with arrays
       Object[] arr = new Object[5];

       String[] words = {"cats", "dogs", "birds"};

       Stack s1 = new Stack();
       System.out.println(s1);
       System.out.println("S1 is empty: " + s1.isEmpty());
       s1.push("wow");
       s1.push("omg");
       s1.push("hello");
       System.out.println(s1);
       System.out.println(s1.peek());
       System.out.println("Removing object from s1: " + s1.pop());
       System.out.println(s1);
       System.out.println("Removing object from s1: " + s1.pop());
       System.out.println(s1);
       System.out.println("Removing object from s1: " + s1.pop());
       System.out.println(s1);
       System.out.println("Removing object from s1: " + s1.pop());

       System.out.println();
       Stack s2 = new Stack(words);
       System.out.println(s2);
       System.out.println("S2 is empty: " + s2.isEmpty());
       System.out.println(s2.peek());
//       s2.push("fish");
       System.out.println(s2);

//      Stack<String> s1 = new Stack<>();
//
//       s1.push("cookies");
//       s1.push("icecream");
//       s1.push("chips");
//
//       System.out.println(s1);
//
//       System.out.println(s1.pop());
//       System.out.println(s1);
//       System.out.println(s1.pop());
//       System.out.println(s1);
//       System.out.println(s1.peek());
//       System.out.println(s1);
//       System.out.println(s1.pop());
//       System.out.println(s1);

//       print1();

   }
   public static void print1() {
       print2();
       System.out.println("I am 1");
   }
   public static void print2() {
       print3();
       System.out.println("I am 2");
   }
   public static void print3() {
       System.out.println("I am 3");
   }
}
