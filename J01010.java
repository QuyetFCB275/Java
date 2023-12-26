import java.util.Scanner;

public class J01010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            String s = sc.next();
            if (check(s))
                System.out.println("INVALID");
            else {
                long ans = 0;
                for (char x : s.toCharArray()) {
                    ans *= 10;
                    if (x == '1')
                        ans += 1;
                }
                System.out.println(ans);
            }
        }
    }

    private static boolean check(String s) {
        int k = 0;
        for (char x : s.toCharArray()) {
            if (x != '0' && x != '1' && x != '8' && x != '9')
                return true;
            if (x == '1')
                k++;
        }
        return k == 0;
    }
}
