import java.util.Scanner;

public class J03024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int c = 0, l = 0, m = 0;
            for (int i=0; i<s.length(); i++) {
                if (Character.isAlphabetic(s.charAt(i))) {
                    m++;
                    continue;
                }
                if ((s.charAt(i) - '0') % 2 == 1)
                    l++;
                else
                    c++;
            }
            if (m > 0 || s.charAt(0) == '0')
                System.out.println("INVALID");
            else if ((s.length() % 2 == 0 && c > l) || (s.length() % 2 == 1 && c < l))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
