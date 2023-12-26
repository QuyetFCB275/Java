import java.util.Scanner;

public class J03006 {
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
        String x = "";
        for (int i=s.length()-1; i>=0; i--) {
            if (s.charAt(i) % 2 == 1)
                return "NO";
            x += String.valueOf(s.charAt(i));
        }
        if (x.equals(s))
            return "YES";
        return "NO";
    }
}
