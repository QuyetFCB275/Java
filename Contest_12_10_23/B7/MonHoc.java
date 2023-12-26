package Contest_12_10_23.B7;

public class MonHoc {
    private String id, name, k;
    public MonHoc(String i, String n, String k) {
        id = i;
        name = n;
        this.k = k;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + k;
    }

    public String getId() {
        return id;
    }
}
