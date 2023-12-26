import java.util.Scanner;

public class J03008 {
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
        String x = "";
        for (int i=l-1; i>=0; i--) {
            char v = s.charAt(i);
            x += String.valueOf(v);
            if (v != '2' && v != '3' && v != '5' && v != '7')
                return "NO";
        }
        if (x.equals(s))
            return "YES";
        return "NO";
    }
}
