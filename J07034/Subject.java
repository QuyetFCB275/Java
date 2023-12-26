package J07034;

public class Subject {
    private String id, name, sum;
    public Subject(String i, String n, String s) {
        id = i;
        name = n;
        sum = s;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sum;
    }
}
