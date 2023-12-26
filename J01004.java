import java.util.Scanner;
import java.lang.Math;

public class J01004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            if (checkPrime(n))
                System.out.println("YES");
            else System.out.println("NO");
        }
    }

    private static boolean checkPrime(long n) {
        if (n <= 1)
            return false;
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}