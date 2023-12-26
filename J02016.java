import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.Math.*;

public class J02016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i=0; i<n; i++)
                a[i] = sc.nextLong();
            Arrays.sort(a);
            if (check(a, n))
                System.out.printf("YES\n");
            else
                System.out.printf("NO\n");
        }
    }

    private static boolean check(long[] a, int n) {
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                long k = (long) (pow(a[i], 2) + pow(a[j], 2));
                long x = (long) sqrt(k);
                if (k != pow(x, 2))
                    continue;
                if (Arrays.binarySearch(a, j+1, n, x) > j)
                    return true;
            }
        }
        return false;
    }
}
