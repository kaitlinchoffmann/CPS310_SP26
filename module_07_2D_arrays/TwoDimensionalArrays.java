//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TwoDimensionalArrays {
    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int[][] numbers = {
                             {4, 6, 9, 7, 8},
                             {5, 3, 3, 5, 7},
                             {9, 1, 5, 1, 8}
                          };

        print2Darray(numbers);
        removeEvenNumbers(numbers);

        System.out.println("\n2D array after removing even values: ");
        print2Darray(numbers);

        int[][] random = new int[4][5];
        addRandomValues(random);

        System.out.println("\nNew array with random values: ");
        print2Darray(random);

        int sum = calculateSum(random);
        System.out.println("Sum of random 2D array: " + sum);

        double average = calculateAverage(random);
        System.out.println("Average of random 2D array: " + average);
    }
//    printing 2D array
    public static void print2Darray(int[][] arr) {
//        outer loop - accesses rows. Code just like with normal array.
        for(int i = 0; i < arr.length; i++) {
//            inner loop - accesses columns. access amount of rows with arr[0].length.
            // can use either arr[0] or arr[i].
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }
//    calculating average of 2D array
    public static double calculateAverage(int[][] arr) {
        int sum = calculateSum(arr);
        double average = (double)sum / (arr.length * arr[0].length);
        return average;
    }
//    calculating sum of 2D array
    public static int calculateSum(int[][] arr) {
        int sum = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j]; // same as sum = sum + arr[i][j];
            }
        }
        return sum;
    }
//    filling 2D array with random values between [1, 9)
    public static void addRandomValues(int[][] arr) {
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random() * 8 + 1);
            }
        }
    }
// removing even integars from an int 2D array
    public static void removeEvenNumbers(int[][] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] % 2 == 0) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
