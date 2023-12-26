import java.util.Scanner;

public class J03040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            s = s.substring(5, 8) + s.substring(9);
            if (check1(s) || check2(s) || check3(s) || check4(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check4(String s) {
        for (int i=0; i<5; i++)
            if (s.charAt(i) != '6' && s.charAt(i) != '8')
                return false;
        return true;
    }

    private static boolean check3(String s) {
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4))
            return true;
        return false;
    }

    private static boolean check2(String s) {
        for (int i=0; i<4; i++)
            if (s.charAt(i) != s.charAt(i+1))
            return false;
        return true;
    }

    private static boolean check1(String s) {
        for (int i=0; i<4; i++)
            if (s.charAt(i) >= s.charAt(i+1))
                return false;
        return true;
    }
}
