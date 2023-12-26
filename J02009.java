import java.util.Scanner;

public class J02009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[1000005];
        for (int i=0; i<n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            a[x] += y;
        }
        int ans = 0;
        for (int i=0; i<1000005; i++) {
            if (a[i] > 0) {
                if (i > ans)
                    ans = i;
                ans += a[i];
            }
        }
        System.out.println(ans);
    }
}
