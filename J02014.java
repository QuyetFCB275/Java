import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n+5];
            long sum = 0;
            long[] f = new long[n+5];
            for (int i=1; i<=n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
                f[i] = f[i-1] + a[i];
            }
            int res = -1;
            for (int i=1; i<=n; i++) {
                if (f[i-1] == sum - f[i]) {
                    res = i;
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
