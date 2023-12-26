package J07049;

public class Product {
    private String id, name;
    private int cost, bh;
    public Product(String i, String n, int c, int s) {
        id = i;
        name = n;
        cost = c;
        bh = s;
    }

    public int getCost() {
        return cost;
    }

    public String getId() {
        return id;
    }

    public int getBh() {
        return bh;
    }
}
