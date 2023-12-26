package J04010;

import java.util.Scanner;

import static java.lang.Math.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            Point x = new Point(sc.nextDouble(), sc.nextDouble());
            Point y = new Point(sc.nextDouble(), sc.nextDouble());
            Point z = new Point(sc.nextDouble(), sc.nextDouble());
            triangle zan = new triangle(x, y, z);
            if (zan.ab + zan.bc <= zan.ca || zan.ab + zan.ca <= zan.bc || zan.bc + zan.ca <= zan.ab)
                System.out.printf("INVALID\n");
            else
                System.out.printf("%.3f\n", zan.square());
        }
    }
}