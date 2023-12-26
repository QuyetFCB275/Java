package J04013;

class thisinh1 {
    String id, name;
    double d1, d2, d3, d;
    public thisinh1(String id, String name, double d1, double d2, double d3) {
        this.id = id;
        this.name = name;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public void solve() {
        if (id.charAt(2) == '1')
            d = 0.5;
        else if (id.charAt(2) == '2')
            d = 1;
        else d = 2.5;
    }
    public double getSum() {
        return d1*2 + d2 + d3;
    }
    public String getTT() {
        if (getSum() + d < 24)
            return "TRUOT";
        else return "TRUNG TUYEN";
    }
    @Override
    public String toString() {
        String res =  id + " " + name + " ";
        if (d == (int) d)
            res += String.format("%.0f ", d);
        else
            res += String.format("%.1f ", d);

        if (getSum() == (int) getSum())
            res += String.format("%.0f ", getSum());
        else
            res += String.format("%.1f ", getSum());
        res += getTT();
        return res;
    }
}