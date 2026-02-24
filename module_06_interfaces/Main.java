import java.util.*;

public class Main {
    public static void main(String[] args) {

        Apple a1 = new Apple("granny smith", 43);
        Apple a2 = new Apple("macintosh", 2);
        Apple a3 = new Apple("empire", 53);
        Apple a4 = new Apple("gala", 8);

//        example of how compareTo is working
        System.out.println(a2.compareTo(a1)); // 2 - 43 = -41
        System.out.println(a3.compareTo(a4)); // 53 - 8 = 45

        System.out.println();
        Apple[] apples = {a1, a2, a3, a4};
        printArray(apples);
        System.out.println();

        Arrays.sort(apples);
        System.out.println("Apples sorted by Type:");
        printArray(apples);

        Chicken c1 = new Chicken(240, true, "white");
        Chicken c2 = new Chicken(45, true, "brown");
        Chicken c3 = new Chicken(500, false, "orange");
        Chicken c4 = new Chicken(34, true, "black");

        Chicken[] chickens = {c1, c2, c3, c4};
        System.out.println("\nPrinting Chicken Array (unsorted):");
        printArray(chickens);

        System.out.println("\nChicken Array Sorted by Color:");
        Arrays.sort(chickens);
        printArray(chickens);

    }

    public static void printArray(Apple[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void printArray(Chicken[] arr) {
        for(int i = 0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
