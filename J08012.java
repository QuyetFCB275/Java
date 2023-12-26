import java.util.Scanner;

public class J08012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] f = new int[n+1];
        for (int i=0; i<n-1; i++) {
            int x = sc.nextInt(), y = sc.nextInt();
            f[x] ++;
            f[y] ++;
        }
        int sum=0;
        for (int i=1; i<=n; i++) {
            if (f[i] > 1)
                sum++;
        }
        if (sum > 1)
            System.out.println("No");
        else
            System.out.println("Yes");
    }
}
