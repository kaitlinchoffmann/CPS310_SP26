public class Apple implements Edible, Comparable<Apple> {
    private String type;
    private int id;

    public Apple(String type, int id) {
        this.type = type;
        this.id = id;
    }

//   configuring compareTo from Comparable interface
//    comparing apples based on id
   public int compareTo(Apple obj) {
        return this.id - obj.id;
   }

//    comparing apples based on type
//    public int compareTo(Apple obj) {
//        return this.type.compareTo(obj.type);
//    }

//    configuring methods from Edible interface
    public String howToEat() {
        return "Eat raw or bake";
    }

    public boolean isEdible() {
        return true;
    }

    public boolean equals(Apple o) {
        return this.type.equals(o.type);
    }

    public String toString() {
        return "Id: " + id + ", Name: " + type;
    }
}
