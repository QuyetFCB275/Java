package J07019;

/**
 * @author QuyetLD
 * @Package J07019
 * @date 12/13/2023 10:04 PM
 * @Copyright T.may
 */
public class Product {
    private String id, name;
    private int m1, m2;

    public Product(String id, String name, int m1, int m2) {
        this.id = id;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
    }

    public String getName() {
        return name;
    }

    public int getM1() {
        return m1;
    }

    public int getM2() {
        return m2;
    }
}
