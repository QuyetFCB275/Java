package J06005;

public class Product {
    private String id, name, dv;
    private long mua, ban;
    public Product(String i, String n, String d, long m, long b) {
        id = i;
        name = n;
        dv = d;
        mua = m;
        ban = b;
    }

    public long getBan() {
        return ban;
    }

    public String toString() {
        return name + " " + dv + " " + mua + " " + ban;
    }
}
