package J04008;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            Point a = new Point(x, y);

            x = sc.nextDouble();
            y = sc.nextDouble();
            Point b = new Point(x, y);

            x = sc.nextDouble();
            y = sc.nextDouble();
            Point c = new Point(x, y);

            double ab = a.distance(b);
            double bc = b.distance(c);
            double ca = c.distance(a);

            if (ab + bc <= ca || ab + ca <= bc || bc + ca <= ab) {
                System.out.println("INVALID\n");
            }
            else
                System.out.printf("%.3f\n", ab+bc+ca);
        }
    }
}