package J06002;

public class Bill implements Comparable<Bill>{
    private String id, name;
    private long cost, count;
    public Bill(String i, String n, long count,long cost) {
        id = i;
        name = n;
        this.cost = cost;
        this.count = count;
    }
    public long getCount() {
        return count;
    }
    public long getDiscount() {
        long sum = cost * count;
        if (getCount() >= 150)
            return sum * 50 / 100;
        else if (getCount() >= 100)
            return sum * 30 / 100;
        else if (getCount() >= 50)
            return sum * 15 / 100;
        return 0;
    }
    public long getPay() {
        return cost * count - getDiscount();
    }
    @Override
    public int compareTo(Bill b) {
        return (int) (b.getPay() - getPay());
    }
    @Override
    public String toString() {
        return id + " " + name + " " + getDiscount() + " " + getPay();
    }
}
