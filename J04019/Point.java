package J04019;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Point {
    double x, y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc) {
        return new Point(sc.nextDouble(), sc.nextDouble());
    }
    public double distance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
}