import java.util.Scanner;
import static java.lang.Math.*;

public class J03026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            if (a.equals(b))
                System.out.println(-1);
            else
                System.out.println(max(a.length(), b.length()));
        }
    }
}
