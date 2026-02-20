import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Shape s1 = new Rectangle(5, 7);
        Shape[] shapes1 = new Shape[5];
        ArrayList<Shape> shapes2 = new ArrayList<>();

        Rectangle r1 = new Rectangle(5, 8);
        Triangle t1 = new Triangle(2, 4, 6, "orange");
        Rectangle r2 = new Rectangle(722, 21);

        shapes2.add(r1);
        shapes2.add(t1);
        shapes2.add(r2);

//   gives us an error due to Shape being abstract:
//        Shape s2 = new Shape();
//        Shape s3 = new Shape(5, "pink", true);

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
