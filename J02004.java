import java.util.Scanner;

public class J02004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n+5];
            for (int i=0; i<n; i++) {
                a[i] = sc.nextLong();
            }
            if (check(a, n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(long[] a, int n) {
        for (int i=0; i<n; i++)
            if (a[i] != a[n-1-i])
                return false;
        return true;
    }
}
