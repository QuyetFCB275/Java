package J06001;

public class Bill {
    private String id, name;
    private long cost, count;
    public Bill (int i, String id, long count, long c, String n) {
        this.id = id + "-" + String.format("%03d", i);
        this.count = count;
        this.cost = c;
        this.name = n;
    }
    public long getDiscount() {
        if (count >= 150)
            return cost * count * 50 / 100;
        else if (count >= 100)
            return cost * count * 30 / 100;
        else if (count >= 50)
            return cost * count * 15 / 100;
        return 0;
    }
    public long getMoney() {
        return cost * count - getDiscount();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + getDiscount() + " " + getMoney();
    }
}