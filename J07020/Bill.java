package J07020;

/**
 * @author QuyetLD
 * @Package J07020
 * @date 12/13/2023 10:29 PM
 * @Copyright T.may
 */
public class Bill {
    private String id;
    private Customer cus;
    private Product pro;
    private int cnt;

    public Bill(String id, Customer cus, Product pro, int cnt) {
        this.id = id;
        this.cus = cus;
        this.pro = pro;
        this.cnt = cnt;
    }

    @Override
    public String toString() {
        return id + " " + cus.getName() + " " + cus.getAdd() + " " + pro.getName() + " " + pro.getDv() + " " + pro.getMua() + " " + pro.getBan() + " " + cnt + " " + pro.getBan()*cnt;
    }
}
