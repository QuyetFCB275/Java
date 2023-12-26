package ThucHanh_15_10_23.B9;

public class Customer implements Comparable<Customer>{
    private String id, name, add, idsp, day, cmp_day;
    private int sum;

    public Customer(String i, String n, String a, String idsp, int s, String d, String cmp_day) {
        id = i;
        name = n;
        add = a;
        this.idsp = idsp;
        sum = s;
        day = d;
        this.cmp_day = cmp_day;
    }
    @Override
    public int compareTo(Customer b) {
        if (cmp_day.equals(b.cmp_day))
            return id.compareTo(b.id);
        return cmp_day.compareTo(b.cmp_day);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + add + " " + idsp + " " + sum + " " + day;
    }
}
