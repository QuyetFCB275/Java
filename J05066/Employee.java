package J05066;

public class Employee implements Comparable<Employee>{
    private String name, rank, id, k;
    public Employee(String n, String r, String i, String k) {
        name = n;
        rank = r;
        id = i;
        this.k = k;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Employee b) {
        if (!k.equals(b.k))
            return - k.compareTo(b.k);
        return id.compareTo(b.id);
    }
    @Override
    public String toString() {
        return name + " " + rank + " " + id + " " + k;
    }
}
