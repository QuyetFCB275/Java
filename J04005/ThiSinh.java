package J04005;

class ThiSinh {
    private String name, date;
    private double d1, d2, d3;
    public ThiSinh(String name, String date, double d1, double d2, double d3) {
        this.name = name;
        this.date = date;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
    }
    public String getName() {
        return name;
    }
    public String getDate() {
        return date;
    }
    public double getSum() {
        return d1 + d2 + d3;
    }
}