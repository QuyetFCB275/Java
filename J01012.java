import java.util.Scanner;
import java.lang.Math;

public class J01012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            int ans = 0;
            for (int i=1; i<=Math.sqrt(n); i++) {
                if (n % i == 0) {
                    if (i % 2 == 0)
                        ans++;
                    if (n / i % 2 == 0 && Math.pow(i, 2) != n)
                        ans++;
                }
            }
            System.out.println(ans);
        }
    }
}
