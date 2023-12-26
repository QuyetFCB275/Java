import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class J07030 {
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
        TreeSet<Integer> se1 = new TreeSet<>();
        TreeSet<Integer> se2 = new TreeSet<>();
        for (Integer x : a1) {
            if (f[x] == 0 && x < 500000)
                se1.add(x);
        }
        for (Integer x : a2) {
            if (f[x] == 0)
                se2.add(x);
        }
        for (Integer x : se1) {
            if (se2.contains(1000000-x))
                System.out.println(x + " " + (1000000-x));
        }
    }
}