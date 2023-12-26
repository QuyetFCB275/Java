import java.util.Scanner;

public class J03007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }

    private static String solve(String s) {
        int l = s.length();
        if (s.charAt(0) != '8')
            return "NO";

        String x = "";
        int sum = 0;
        for (int i=l-1; i>=0; i--) {
            char v = s.charAt(i);
            x += String.valueOf(v);
            sum += v - '0';
        }
        if (x.equals(s) && sum % 10 == 0)
            return "YES";
        return "NO";
    }
}
