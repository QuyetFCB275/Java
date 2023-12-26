package J07058;

public class Subject implements Comparable<Subject>{
    private String id, name, form;
    public Subject(String i, String n, String f) {
        id = i;
        name = n;
        form = f;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + form;
    }
    @Override
    public int compareTo(Subject b) {
        return id.compareTo(b.id);
    }
}
