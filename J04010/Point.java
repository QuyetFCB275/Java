package J04010;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Point {
    double x, y;
    public Point() {
        this.x = 0;
        this.y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point point1) {
        this.x = point1.x;
        this.y = point1.y;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distance(Point p) {
        return sqrt(pow(this.x - p.x, 2) + pow(this.y - p.y, 2));
    }
    public double distance(Point a, Point b) {
        return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2));
    }
    @Override
    public String toString() {
        return x + " " + y;
    }
}