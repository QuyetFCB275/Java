package J06005;

public class Bill {
    private String id;
    private Customer kh;
    private Product pr;
    private int sum;
    public Bill(String i, Customer c, Product p, int s) {
        id = i;
        kh = c;
        pr = p;
        sum = s;
    }
    public String toString() {
        return id + " " + kh.toString() + " " + pr.toString() + " " + sum + " " + sum* pr.getBan();
    }
}
