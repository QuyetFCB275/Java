package J06006;

public class Customer {
    private String id, name, sex, date, add;
    public Customer(String i, String n, String s, String d, String a) {
        id = i;
        name = n;
        sex = s;
        date = d;
        add = a;
    }
    public String toString () {
        return name + " " + add;
    }
}