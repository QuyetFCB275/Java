package J07050;

public class Product implements Comparable<Product>{
    private String id, name, kind;
    private double mua, ban, loinhuan;
    public Product(int i, String n, String k, double m, double b) {
        id = "MH" + String.format("%02d", i);
        name = n;
        kind = k;
        mua = m;
        ban = b;
        loinhuan = b - m;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + kind + " " + String.format("%.2f", loinhuan);
    }
    @Override
    public int compareTo(Product b) {
        return (int) (b.loinhuan - loinhuan);
    }
}