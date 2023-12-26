import java.util.Scanner;
import static java.lang.Math.*;

public class J01018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(String s) {
        int sum = s.charAt(0) - '0';
        for (int i=1; i<s.length(); i++) {
            if (abs(s.charAt(i) - s.charAt(i-1)) != 2)
                return false;
            sum += s.charAt(i) - '0';
        }
        return sum % 10 == 0;
    }
}
