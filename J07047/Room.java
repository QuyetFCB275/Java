package J07047;

public class Room {
    private String kind, name;
    private long cost;
    private double ps;
    public Room(String k, String n, long c, double p) {
        kind = k;
        name = n;
        cost = c;
        ps = p;
    }

    public long getCost() {
        return cost;
    }

    public double getPs() {
        return ps;
    }
}
