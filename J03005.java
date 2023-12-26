import java.util.Scanner;

public class J03005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();
            String[] a = s.split("\\s+");
            String start = a[0];
            String ans = "";
            for (String x : a) {
                if (x != start) {
                    ans += String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1) + " ";
                }
            }
            ans = ans.trim();
            ans += ", " + start.toUpperCase();
            System.out.println(ans);
        }
    }
}