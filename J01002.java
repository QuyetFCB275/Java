import java.util.Scanner;

public class J01002 {
    public static void main(String[] args) {
        long t, n;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextLong();
            System.out.println(n * (n + 1) / 2);
        }
    }
}
