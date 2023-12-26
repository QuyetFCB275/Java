import java.io.*;
import java.util.*;

public class J07031 {
    public static int[] f = new int[1000005];
    public static void init() {
        f[0] = f[1] = 1;
        for (int i=2; i<1000005; i++) {
            if (f[i] == 0) {
                for (int j=i*2; j<1000005; j += i) {
                    f[j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();

        init();
        TreeSet<Integer> se = new TreeSet<>();
        for (Integer x : a1) {
            if (f[x] == 0 && x < 500000 && !a2.contains(x))
                se.add(x);
        }

        for (Integer x : se) {
            if (a1.contains(1000000-x) && !a2.contains(1000000-x) && f[1000000-x] == 0)
                System.out.println(x + " " + (1000000-x));
        }
    }
}