import java.math.BigInteger;
import java.util.Scanner;
import static java.lang.Math.*;

public class J03013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            int l = max(a.toString().length(), b.toString().length());
            BigInteger ans = a.subtract(b).abs();
            if (l > ans.toString().length())
                 System.out.print(0);
            System.out.println(ans);
        }
    }
}
