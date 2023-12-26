import java.util.Scanner;
import static java.lang.Math.*;

public class J02022 {
    public static int[] used = new int[11];
    public static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            String s = "";
            Try("");
        }
    }

    private static void Try(String s) {
        if (s.length() == n) {
            System.out.println(s);
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (s.length() == 0 || (abs(s.charAt(s.length() - 1) - (i + '0')) != 1 && used[i] == 0)) {
                used[i] = 1;
                Try(s + i);
                used[i] = 0;
            }
        }
    }
}