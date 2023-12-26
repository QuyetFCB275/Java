package J07048;

public class Product implements Comparable<Product>{
    private String id, name;
    private int cost, time;
    public Product(String i, String n, int c, int t) {
        id = i;
        name = n;
        cost = c;
        time = t;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + cost + " " + time;
    }
    @Override
    public int compareTo(Product b) {
        if (cost == b.cost)
            return id.compareTo(b.id);
        return b.cost - cost;
    }
}
