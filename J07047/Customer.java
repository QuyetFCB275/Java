package J07047;

public class Customer {
    private String id, name, room;
    private long day;
    private double money;
    public Customer(String i, String n, String r, long d, double m) {
        id = i;
        name = n;
        room = r;
        day = d;
        money = m;
    }

    public long getDay() {
        return day;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + day + " " + String.format("%.2f", money);
    }
}
