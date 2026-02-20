public class Triangle extends Shape {
    //    instance variables
    private double side1;
    private double side2;
    private double side3;

    //    constructors
    public Triangle() {
        super(3, "pink", false);
        side1 = 0;
        side2 = 0;
        side3 = 0;
    }

    public Triangle(double s1, double s2, double s3, String color) {
        isValid(s1, s2, s3);
        super.setColor(color);
    }

    public double getArea() { // I fixed this after a google search :)
        double s = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    //    get/accessors methods
    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    //    set/mutator methods
    public void setSide1(double s1) {
        isValid(s1, side2, side3);
    }

    public void setSide2(double s2) {
        isValid(s2, side2, side3);
    }

    public void setSide3(double s3) {
        isValid(s3, side2, side3);
    }

    //    other methods
    public boolean isValid(double s1, double s2, double s3) {
        if ((s1 + s2 > s3) && (s2 + s3 > s1) && (s1 + s3 > s2)) {
            side1 = s1;
            side2 = s2;
            side3 = s3;
            return true;
        }
        System.out.println("Not valid sides!");
        System.exit(1);
        return false;
    }

    public boolean equals(Triangle o) {
        if (side1 == o.side1 && side2 == o.side2 && side3 == o.side3 && super.equals(o)) {
            return true;
        }
        return false;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Perimeter = " + getPerimeter() + ", Color = " + super.getColor();
    }
}
