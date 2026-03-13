import java.util.*;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {3, 1, 7, 2, 10, 8};

        System.out.println("Before Sorting:");
        printArray(numbers);
//        Arrays.sort(numbers);
//        selectionSort(numbers);
        System.out.println("\nAfter Sorting:");
        insertionSort(numbers);
        printArray(numbers);

    }
   // {1, 2, 3, 7, | 10, 8} currentElement = 2.
   //  0  1  2  3  | 4  5

    // {3, 1, 7, 2, 10, 8}
//    Insertion sort
   public static void insertionSort(double[] arr) {
       for(int i = 1; i<arr.length; i++) {
           double currentElement = arr[i];
           int j;
           for(j = i - 1; j >= 0 && arr[j] > currentElement; j--) {
               arr[j + 1] = arr[j];
           }
           arr[j+1] = currentElement;
       }
   }

    // selection sort
    public static void selectionSort(double[] arr) {
       for(int i = 0; i<arr.length - 1; i++) {
           int min = i;
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[j] < arr[min]) {
                   min = j;
               }
           }
           double temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
    // printing double array 
    public static void printArray(double[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}