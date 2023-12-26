package ThucHanh24_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class B8 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> a1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> a2 = (ArrayList<Integer>) in2.readObject();

        TreeMap<Integer, Integer> hs1 = new TreeMap<>();
        for (Integer x : a1) {
            if (check(x)) {
                if (hs1.containsKey(x))
                    hs1.replace(x, hs1.get(x) + 1);
                else
                    hs1.put(x, 1);
            }
        }

        HashMap<Integer, Integer> hs2 = new HashMap<>();
        for (Integer x : a2) {
            if (check(x)) {
                if (hs2.containsKey(x))
                    hs2.replace(x, hs2.get(x) + 1);
                else
                    hs2.put(x, 1);
            }
        }

        for (Integer x : hs1.keySet()) {
            if (hs2.containsKey(x))
                System.out.println(x + " " + hs1.get(x) + " " + hs2.get(x));
        }
    }

    private static boolean check(Integer x) {
        String s = String.valueOf(x);
        if (s.length() <= 1)
            return false;
        for (int i=0; i<s.length()-1; i++) {
            if (s.charAt(i) > s.charAt(i+1))
                return false;
        }
        return true;
    }
}
