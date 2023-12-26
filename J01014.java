import java.util.Scanner;
import static java.lang.Math.*;

public class J01014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int ans = 2;
            while (ans < sqrt(n)) {
                if (n % ans == 0) {
                    while (n % ans == 0)
                        n /= ans;
                }
                ans++;
            }
            if (n > 1)
                System.out.println(n);
            else
                System.out.println(ans);
        }
    }
}
