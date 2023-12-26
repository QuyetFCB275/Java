package J07037;


public class Company {
    private String id, name, sum;
    public Company(String i, String n, String s) {
        id = i;
        name = n;
        sum = s;
    }

    public String getId() {
        return id;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sum;
    }
}
