import java.util.Scanner;

public class J01009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = 0, k = 1;
        for (int i=1; i<=n; i++) {
            k *= i;
            ans += k;
        }
        System.out.println(ans);
    }
}
