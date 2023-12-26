package ThucHanh_15_10_23;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;


public class B2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();

        HashMap<Integer, Integer> h1 = new HashMap<>();
        for (Integer x : a1) {
            if (h1.containsKey(x))
                h1.replace(x, h1.get(x) + 1);
            else if (check(x))
                h1.put(x, 1);
        }

        HashMap<Integer, Integer> h2 = new HashMap<>();
        for (Integer x : a2) {
            if (h2.containsKey(x))
                h2.replace(x, h2.get(x) + 1);
            else if (check(x))
                h2.put(x, 1);
        }

        for (int i=10; i<=9999; i++) {
            if (h1.containsKey(i) && h2.containsKey(i))
                System.out.println(i + " " + h1.get(i) + " " + h2.get(i));
        }
    }

    private static boolean check(Integer x) {
        String s = String.valueOf(x);
        for (int i=1; i<s.length(); i++) {
            if (s.charAt(i) < s.charAt(i-1))
                return false;
        }
        return s.length() > 1;
    }
}
