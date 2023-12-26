package J07045;

public class LoaiPhong implements Comparable<LoaiPhong>{
    private String id, name, cost, mo;
    public LoaiPhong(String s) {
        String[] a = s.split(" ");
        id = a[0];
        name = a[1];
        cost = a[2];
        mo = a[3];
    }
    @Override
    public String toString() {
        return id + " " + name + " " + cost + " " + mo;
    }
    @Override
    public int compareTo(LoaiPhong b) {
        return name.compareTo(b.name);
    }
}
