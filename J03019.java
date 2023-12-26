import java.util.Scanner;

public class J03019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        for (int i=s.length()-1; i>=0; i--) {
            if (ans.isEmpty())
                ans += s.charAt(i);
            else if (s.charAt(i) >= ans.charAt(ans.length()-1))
                ans += s.charAt(i);
        }
        System.out.println((new StringBuilder(ans)).reverse());
    }
}
