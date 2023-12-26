import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class J07003 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
//        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        while (s.length() > 1) {
            int l = s.length()/2;
            String s1 = s.substring(0, l);
            String s2 = s.substring(l);
            BigInteger a = (new BigInteger(s1)).add(new BigInteger(s2));
            s = a.toString();
            System.out.println(s);
        }
    }
}
