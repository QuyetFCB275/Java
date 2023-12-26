package J07056;

public class Customer implements Comparable<Customer>{
    private String id, name;
    private int m1, m2, thue, sum;

    public Customer(String i, String n, int m1, int m2, int thue) {
        this.id = i;
        this.name = n;
        this.m1 = m1;
        this.m2 = m2;
        this.thue = thue;
        this.sum = this.m1 + this.m2 + this.thue;
    }

    @Override
    public int compareTo(Customer b) {
        return b.sum - sum;
    }

    @Override
    public String toString() {
        return id + " " + name + "" + m1 + " " + m2 + " " + thue + " " + sum;
    }
}
