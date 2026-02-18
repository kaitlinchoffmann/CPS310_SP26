import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        PROBLEM 1e.

        Note n1 = new Note();
        Note n2 = new Note("lab was sooo boring today", "02/06/2023", false);

        System.out.println(n1);
        System.out.println(n2);

        String text = n2.getText();
        String date = n2.getDate();
        boolean locked = n2.getLocked();

        System.out.println(text + ", " + date + ", " + locked);

        n2.setLocked(true);
        n2.setText("Hello World!!!!");
        n2.setDate("10/30/2019");
        System.out.println("hello");
        System.out.println(n2);

//      uncomment and run to show that checkDate method works
//        n1.setDate("44/02/2023");

//        PROBLEM 1f.
        ArrayList<Note> notes = new ArrayList<Note>();
        Scanner in = new Scanner(new File("notes.csv"));

        while(in.hasNextLine()) {
            String line = in.nextLine(); // buy milk,12/08/2021,FALSE
            String[] data = line.split(","); // ["buy milk", "12/08/2021", "FALSE"]
            boolean lockedNote = Boolean.parseBoolean(data[2]);
            Note n = new Note(data[0], data[1], lockedNote);
            notes.add(n);
        }

        System.out.println(notes);
    }
}