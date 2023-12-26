package J04001;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Point {
    double x, y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    double distance(Point b) {
        double v1 = x - b.x;
        double v2 = y - b.y;
        return sqrt(v1 * v1 + v2 * v2);
    }

    static double distance(Point a, Point b) {
        double v1 = a.x - b.x;
        double v2 = a.y - b.y;
        return sqrt(pow(v1, 2) + pow(v2, 2));
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}