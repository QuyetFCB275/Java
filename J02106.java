import java.util.Scanner;

public class J02106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i=0; i<n; i++) {
            int sum = 0;
            int x;
            for (int j=0; j<3; j++) {
                x = sc.nextInt();
                if (x == 1)
                    sum++;
            }
            if (sum > 1) ans++;
        }
        System.out.println(ans);
    }
}
