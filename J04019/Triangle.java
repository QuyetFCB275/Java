package J04019;

class Triangle {
    Point a, b, c;
    double ab, bc, ca;
    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.ab = a.distance(b);
        this.bc = b.distance(c);
        this.ca = c.distance(a);
    }
    public String getPerimeter() {
        return String.format("%.3f", ab + bc + ca);
    }
    public boolean valid() {
        if (ab + bc <= ca || ab + ca <= bc || bc + ca <= ab)
            return false;
        return true;
    }
}