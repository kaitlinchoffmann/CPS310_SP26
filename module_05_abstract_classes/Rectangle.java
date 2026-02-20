class Rectangle extends Shape {
    //    attributes
    private double length;
    private double width;

    //    constructors
    public Rectangle() {
        this(7, 9);
    }

    public Rectangle(double length, double width) {
        super(4, "blue", true);
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
//    getter and setter methods

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //    toString()
// equals method - two rectangles are equal if equals method in Shape
//    class is true AND the length and width of two recatangles are equal
    public boolean equals(Rectangle obj) {
        if (this.length == obj.length && this.width == obj.width
                && super.equals(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String shapeInfo = super.toString();
//        String shapeInfo = super.getNumOfSides() + " ";
        String rectangleInfo = ", length: " + length + ", width: " + width;
        return shapeInfo + rectangleInfo;
    }
}
