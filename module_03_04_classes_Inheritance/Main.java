import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        User u1 = new User("badpassword", "bob", 12345);
        User u2 = new User("betterpassword", "alice", 55555);
        User u3 = new User("badpassword", "bob", 12345);

        boolean sameUser1 = u1.equals(u2); // false
        boolean sameUser2 = u1.equals(u3); // true

        System.out.println("User 1 equals User 2: " + sameUser1);
        System.out.println("User 1 equals User 3: " + sameUser2);

        Shape s1 = new Shape();
        System.out.println("S1: Number of shapes created: " + s1.getNumOfShapes());

        Shape s2 = new Shape(4, "blue", true);
        System.out.println("S2: Number of shapes created: " + s2.getNumOfShapes());

        Shape s3 = new Shape(4, "blue", true);

        boolean sameShape1 = s2.equals(s3);
        boolean sameShape2 = s1.equals(s3);
        System.out.println("Shape 1 and Shape 2 are equal: " + sameShape1);
        System.out.println("Shape 1 and Shape 3 are equal: " + sameShape2);

        s1.setNumOfSides(7);
        s1.setColor("orange");

        Shape[] shapes1 = {s1, s2, s3};
        Shape[] shapes2 = new Shape[5];

        int[] random1 = {1, 2, 3};
        Integer[] random2 = {2, 4, 5};

        int num = random1[0];
        Integer num2 = random2[0];

        Character[] animal = {'c', 'a', 't'};
        char[] greeting = {'h', 'i', '!'};

        Character letter1 = animal[0];
        char letter2 = greeting[0];

        Character.isUpperCase(letter1);
        Character.isLetter(letter2);

        System.out.println(Character.isLetter('A'));
        System.out.println(Character.isLetter(65));

        ArrayList<Shape> shapes3 = new ArrayList<>();
        shapes3.add(s1);
        shapes3.add(s2);
        shapes3.add(s3);

        printShapeArrayList(shapes3);

        System.out.println("S1: Number of shapes created: " + s1.getNumOfShapes());
        System.out.println("S2: Number of shapes created: " + s2.getNumOfShapes());
        System.out.println("S3: Number of shapes created: " + s3.getNumOfShapes());

        System.out.println("\nEquality: ");
        Rectangle r1 = new Rectangle(5, 6);
        Rectangle r2 = new Rectangle(5, 6);
        Rectangle r3 = new Rectangle(10, 12);
        System.out.println("R1 equals R2: " + r1.equals(r2));
        System.out.println("R2 equals R3: " + r2.equals(r3));

        System.out.println();
        System.out.println(r1);
        System.out.println(r1.getNumOfSides());
        System.out.println(r1.getColor());
        System.out.println(r1.getStriped());

    }

    public static void printShapeArrayList(ArrayList<Shape> shapes) {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(shapes.get(i).getColor());
        }
    }

    public static void printShapeArray(Shape[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getNumOfSides() + " ");
        }
        System.out.println();
    }
}
