package J06006;

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

    public long getMua() {
        return mua;
    }

    public long getBan() {
        return ban;
    }

    public String toString() {
        return name;
    }
}