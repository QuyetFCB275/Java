import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;
import java.util.TreeSet;

public class J07032 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();
        TreeSet<Integer> se1 = new TreeSet<>(a1);
        TreeSet<Integer> se2 = new TreeSet<>(a2);
        ArrayList<Integer> van = new ArrayList<>();

        int dem=0;
        for (Integer x : se1) {
            if (check(x) && se2.contains(x)) {
                van.add(x);
                dem++;
            }
            if (dem == 10)
                break;
        }
        for (Integer x : van) {
            System.out.println(x + " " + (Collections.frequency(a1, x) + Collections.frequency(a2, x)));
        }
    }

    private static boolean check(Integer x) {
        String s = String.valueOf(x);
        for (int i=0; i<s.length(); i++) {
            if ((s.charAt(i) - '0') % 2 == 0 || s.charAt(i) != s.charAt(s.length()-1-i))
                return false;
        }
        return s.length() > 1 && s.length() % 2 == 1;
    }
}