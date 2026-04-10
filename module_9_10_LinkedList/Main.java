//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<>(); // []
        Node<String> n1 = new Node<>("dog");
        Node<String> n2 = new Node<>("cat");
        Node<String> n3 = new Node<>("bird");
        Node<String> n4 = new Node<>("fish");

        System.out.println("LL Words is empty: " + words.isEmpty());

        System.out.println(n1);
        words.add(n1);
        System.out.println("LL Words is empty: " + words.isEmpty());
        words.add(n2);
        words.add(n3);
        words.add(n4);
        System.out.println(words);

        System.out.println("Size of LL is " + words.size());
//
//        System.out.println(words.getLast());
//        System.out.println("Size: " + words.size());

    }
}
