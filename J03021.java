import java.util.HashMap;
import java.util.Scanner;

public class J03021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next().toUpperCase();
            String res = "";
            for (int i=0; i<s.length(); i++) {
                int k = s.charAt(i);
                if (k < 68)
                    res += 'A';
                else if (k < 71)
                    res += 'D';
                else if (k < 74)
                    res += 'G';
                else if (k < 77)
                    res += 'J';
                else if (k < 80)
                    res += 'M';
                else if (k < 84)
                    res += 'P';
                else if (k < 87)
                    res += 'T';
                else
                    res += 'W';
            }
//            System.out.println(res);
            StringBuilder a = new StringBuilder(res).reverse();
            String ans = a.toString();
            if (res.equals(ans))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
