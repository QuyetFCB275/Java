package J05017;

public class Customer {
    private String id, name;
    private float money;
    public Customer(String i, String n, float m) {
        id = i;
        name = n;
        money = m;
    }

    public float getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + String.format("%.0f", money);
    }
}
