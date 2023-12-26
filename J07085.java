import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class J07085 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("VANBAN.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        for (String s : a) {
            String res = "";
            int sum=0;
            for (char x : s.toCharArray()) {
                if (Character.isDigit(x)) {
                    if (x == '0' && !res.isEmpty())
                        res += x;
                    else if (x != '0') {
                        res += x;
                        sum += x - '0';
                    }
                }
            }
            System.out.println(res + " " + sum);
        }
    }
}
