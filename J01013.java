import java.util.Scanner;
import java.lang.Math;

public class J01013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long ans = 0;
        boolean[] a = new boolean[(int) 2e6 + 5];
        for (int i=2; i<2e6 + 5; i++)
            a[i] = true;
        a[1] = false;
        for (int i=2; i<2e6; i++) {
            if (a[i]) {
                for (int j = i * 2; j< 2e6; j += i)
                    a[j] = false;
            }
        }
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n <= 3) {
                ans += n;
                continue;
            }
            for (int i=2; i<=Math.sqrt(n); i++) {
                while (n % i == 0) {
                    ans += i;
                    n /= i;
                }
                if (a[n]) {
                    ans += n;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}