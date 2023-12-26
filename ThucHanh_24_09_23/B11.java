package ThucHanh24_9;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class B11 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            long sum=0;
            String v = "";
            String res = "";
            for (Character x : s.toCharArray()) {
                if (x == '0' || x == '1') {
                    v += x;
                    res = x + res;
                }
            }
            for (int i=0; i<res.length(); i++) {
                sum += (res.charAt(i) - '0') * (Math.pow(2, i));
            }
            System.out.println(v + " " + sum);
        }
    }
}
