import java.util.Scanner;

public class J03027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        String ans = "";
        for (char x : a) {
            if (ans.isEmpty())
                ans += x;
            else if (x == ans.charAt(ans.length() - 1))
                ans = ans.substring(0, ans.length()-1);
            else
                ans += x;
        }
        if (!ans.isEmpty())
            System.out.println(ans);
        else
            System.out.println("Empty String");
    }
}
