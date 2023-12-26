import java.util.Scanner;
import static java.lang.Math.*;

public class J01017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            if (check(s)) {
                System.out.printf("YES\n");
            }
            else
                System.out.printf("NO\n");
        }
    }

    private static boolean check(String s) {
        for (int i=0; i<s.length() - 1; i++) {
            if (abs(s.charAt(i) - s.charAt(i+1)) != 1)
                return false;
        }
        return true;
    }
}
