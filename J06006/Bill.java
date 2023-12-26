package J06006;

public class Bill implements Comparable<Bill>{
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

    public Product getPr() {
        return pr;
    }

    public String toString() {
        return id + " " + kh.toString() + " " + pr.toString() + " " + sum + " " + sum* pr.getBan() + " " + getLoinhuan();
    }
    public long getLoinhuan() {
        return sum * (pr.getBan() - pr.getMua());
    }
    public int compareTo(Bill b) {
        return - (int) (getLoinhuan() - b.getLoinhuan());
    }
}