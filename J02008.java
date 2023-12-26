import java.util.Scanner;
import static java.lang.Math.*;

public class J02008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[] = new int[200];
            for (int i=2; i<=n; i++) {
                int x = i, k = 2;
                while (k <= sqrt(x)) {
                    if (x % k == 0) {
                        int dem = 0;
                        while (x % k == 0) {
                            dem++;
                            x /= k;
                        }
                        if (a[k] < dem)
                            a[k] = dem;
                    }
                    k++;
                }
                if (x > 1 && a[x] == 0)
                    a[x] = 1;
            }
            long ans = 1;
            for (int i=2; i<=n; i++)
                if (a[i] > 0)
                    ans *= pow(i, a[i]);
            System.out.println(ans);
        }
    }
}