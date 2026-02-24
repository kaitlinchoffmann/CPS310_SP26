public class Chicken implements Edible, Comparable<Chicken> {
    private int id;
    private boolean hen;
    private String color;

    public Chicken(int id, boolean hen, String color) {
        this.id = id;
        this.hen = hen;
        this.color = color;
    }
 //   configuring compareTo from Comparable interface
//    comparing chickens based on id
//    public int compareTo(Chicken obj) {
//        return  obj.id - this.id; // subtracting this from obj sorts in descending order
//    }

//    configuring compareTo from Comparable interface
//    comparing chickens based on color
    public int compareTo(Chicken obj) {
        return this.color.compareTo(obj.color);
    }

    public String howToEat() {
        return "Must be cooked until 165 degrees fahrenheit";
    }

    public boolean isEdible() {
        return true;
    }

    public boolean equals(Chicken o) {
        return id == o.id;
    }

    public String toString() {
        return "Id: " + id + ", hen: " + hen + ", color: " + color;
    }
}
