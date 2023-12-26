package J05016;

/**
 * @author QuyetLD
 * @Package J05016
 * @date 12/17/2023 10:33 PM
 * @Copyright T.may
 */
public class Customer implements Comparable<Customer>{
    private String id, name, room;
    private int day, money;

    public Customer(String id, String name, String room, int day, int money) {
        this.id = id;
        this.name = name;
        this.room = room;
        this.day = day;
        this.money = money;
    }
    @Override
    public int compareTo(Customer b) {
        return b.money - money;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + room + " " + day + " " + money;
    }
}
