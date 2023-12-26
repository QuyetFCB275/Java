package Contest_09_11_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class B2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream sc2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        TreeSet<String> se1 = new TreeSet<>();
        ArrayList<String> arr1 = (ArrayList<String>) sc1.readObject();
        for (String x : arr1) {
            se1.add(x);
        }

        TreeSet<Integer> se2 = new TreeSet<>();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) sc2.readObject();
        for (Integer x : arr2) {
            se2.add(x);
        }

        TreeSet<String> ans = new TreeSet<>();
        for (String x : se1) {
            for (Integer a : se2) {
                ans.add(x + a);
            }
        }
        for (String x : ans) {
            System.out.println(x);
        }
    }
}
