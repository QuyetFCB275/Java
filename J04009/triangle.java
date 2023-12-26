package J04009;

import static java.lang.Math.sqrt;

class triangle {
    Point a, b, c;
    double ab, bc, ca;
    public triangle(Point x, Point y, Point z) {
        this.a = x;
        this.b = y;
        this.c = z;
        this.ab = a.distance(b);
        this.bc = b.distance(c);
        this.ca = c.distance(a);
    }
    public double square() {
        double v = ab + bc + ca;
        double v1 = ab + bc - ca;
        double v2 = ab - bc + ca;
        double v3 = - ab + bc + ca;
        return sqrt(v*v1*v2*v3) / 4;
    }
}