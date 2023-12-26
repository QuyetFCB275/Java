import java.util.Scanner;

public class J03025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int sum = 0;
            for (int i=0; i<s.length()/2; i++) {
                if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                    sum++;
            }
            if (sum == 1 || (sum == 0 && s.length() % 2 == 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
