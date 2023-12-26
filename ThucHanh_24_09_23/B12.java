package ThucHanh24_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class B12 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<String> a1 = (ArrayList<String>) in1.readObject();

        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();

        TreeSet<String> se1 = new TreeSet<>();
        for (String s : a1)
            se1.add(s);

        TreeSet<Integer> se2 = new TreeSet<>();
        for (Integer s : a2)
            se2.add(s);

        for (String s : se1) {
            for (Integer x : se2) {
                System.out.println(s + x);
            }
        }
    }
}
