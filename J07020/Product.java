package J07020;

/**
 * @author QuyetLD
 * @Package J07020
 * @date 12/13/2023 10:29 PM
 * @Copyright T.may
 */
public class Product {
    private String id, name, dv;
    private int mua, ban;

    public Product(String id, String name, String dv, int mua, int ban) {
        this.id = id;
        this.name = name;
        this.dv = dv;
        this.mua = mua;
        this.ban = ban;
    }

    public String getName() {
        return name;
    }

    public String getDv() {
        return dv;
    }

    public int getMua() {
        return mua;
    }

    public int getBan() {
        return ban;
    }
}
