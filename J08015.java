import java.util.HashMap;
import java.util.Scanner;

public class J08015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            long ans=0;
            HashMap<Long, Long> hs = new HashMap<>();
            for (int i=0; i<n; i++) {
                a[i] = sc.nextLong();
                if (hs.get(k - a[i]) != null)
                    ans += hs.get(k - a[i]);
                hs.put(a[i], hs.get(a[i]) != null ? hs.get(a[i]) + 1 : 1);
            }
            System.out.println(ans);
        }
    }
}
