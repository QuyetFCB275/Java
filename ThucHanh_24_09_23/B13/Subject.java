package ThucHanh24_9.B13;

public class Subject {
    private String id, name, k;
    public Subject(String i, String n, String k) {
        id = i;
        name = n;
        this.k = k;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + k;
    }
}
