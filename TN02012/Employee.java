package TN02012;

public class Employee {
    private String id, name, add;
    private long mo;
    public Employee(String i, String n, String a, long m) {
        id = i;
        name = n;
        add = a;
        mo = m;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + "" + add + " " + mo;
    }
}
