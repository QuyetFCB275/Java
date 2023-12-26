import java.util.Scanner;
import java.lang.Math;

public class J01005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            for (int i = 1; i < n; i++) {
                double x = h * Math.sqrt((double) i / n);
                System.out.printf("%.6f ", x);
            }
            System.out.println();
        }
    }
}
