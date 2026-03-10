import java.util.*;

public class SortingSearching {
    public static void main(String[] args) {

        int[] numbers = {3, 1, 7, 2, 10, 8};

//        Arrays.sort(numbers);
        selectionSort(numbers);
        printArray(numbers);

        boolean foundKey = improvedLinearSearch(numbers, 10);
        System.out.println("10 is in my array: " + foundKey);

        foundKey = improvedLinearSearch(numbers, 1);
        System.out.println("1 is in my array: " + foundKey);

        foundKey = improvedLinearSearch(numbers, 722);
        System.out.println("722 is in my array: " + foundKey);

        foundKey = improvedLinearSearch(numbers, 5);
        System.out.println("5 is in my array: " + foundKey);

        System.out.println("\nBinary Search Run:");
        boolean foundKeyBool = binarySearch(numbers, 4);
        System.out.println("Found key: " + foundKeyBool);
    }
   // {1, 3, 7, 2, 10, 8}
   //  0  1  2  3   4  5
    // selection sort
    public static void selectionSort(int[] arr) {
       for(int i = 0; i<arr.length - 1; i++) {
           int min = i;
           for (int j = i + 1; j < arr.length; j++) {
               if (arr[j] < arr[min]) {
                   min = j;
               }
           }
           int temp = arr[i];
           arr[i] = arr[min];
           arr[min] = temp;
       }
    }
    // binary search
    // {1, 2, 3, 7, 8, 10}
    //  0  1  2  3  4  5
    public static boolean binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length-1;
        int mid;

        while(high >= low) {
            mid = (low + high) / 2;
            if(arr[mid] == key) {
                return true;
            } else if(key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    //    improved linear search
    public static boolean improvedLinearSearch(int[] arr, int key) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == key) {
                return true;
            } else if(arr[i] > key) {
                return false;
            }
        }
        return false;
    }
//    linear brute force
    public static boolean bruteForceSearch(int[] arr, int key) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] == key) {
                return true;
            }
        }
        return false;
    }
    
    public static void printArray(int[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}