package J07046;

public class Customer implements Comparable<Customer>{
    private String id, name, id_room;
    private int day;
    public Customer(String i, String n, String id_r, int d) {
        id = i;
        name = n;
        id_room = id_r;
        day = d;
    }
    @Override
    public int compareTo(Customer b) {
        return b.day - day;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + id_room + " " + day;
    }
}
