package J06001;

public class Product {
    private String id, name;
    private long m1, m2;
    public Product(String i, String n, long m1, long m2) {
        this.id = i;
        this.name = n;
        this.m1 = m1;
        this.m2 = m2;
    }
    public String getId() {
        return id;
    }
    public long getM1() {
        return m1;
    }
    public long getM2() {
        return m2;
    }
    public String getName() {
        return name;
    }
}
