abstract class Shape {
    //    attributes
    private static int numOfShapes = 0;
    private int numOfSides;
    private String color;
    private boolean striped;

    //  `constructors
    protected Shape() { // # in UML means protected
        numOfSides = 3;
        color = "pink";
        striped = true;
        numOfShapes++;
    }

    protected Shape(int numOfSides, String color, boolean striped) { // # in UML means protected
        this.numOfSides = numOfSides;
        this.color = color;
        this.striped = striped;
        numOfShapes++;
    }

    abstract double getArea(); // # in UML means to use abstract keyword

    //    get/accessor methods
    public int getNumOfSides() {
        return numOfSides;
    }

    public String getColor() {
        return color;
    }

    public boolean getStriped() {
        return striped;
    }

    public int getNumOfShapes() {
        return numOfShapes;
    }

    //    set/mutator methods
    public void setNumOfSides(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStriped(boolean striped) {
        this.striped = striped;
    }

    //    equals method
    public boolean equals(Shape o) {
        if (this.numOfSides == o.numOfSides && this.striped == o.striped && this.color.equals(o.color)) {
            return true;
        }
        return false;
    }

    //    toString
    public String toString() {
        return "Sides: " + numOfSides
                + ", Color: " + color
                + ", Striped: " + striped;
    }
}
