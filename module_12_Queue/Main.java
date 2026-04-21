public class Main {
    public static void main(String[] args) throws QueueEmptyException {
        Queue<String> q1 = new Queue<String>();
        Queue<Integer> q2 = new Queue<>();

        q2.add(8);
        q2.add(722);
        q2.add(2);

        System.out.println(q2);
        System.out.println(q2.peek());

        System.out.println("\n");
        System.out.println(q2.remove());
        System.out.println(q2);

        System.out.println(q2.remove());
        System.out.println(q2);

        System.out.println(q2.remove());
        System.out.println(q2);

        System.out.println(q2.remove());


    }
}
