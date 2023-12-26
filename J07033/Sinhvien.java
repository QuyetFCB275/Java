package J07033;

public class Sinhvien implements Comparable<Sinhvien>{
    private String id, name, love, email;
    public Sinhvien(String i, String n, String l, String e) {
        id = i;
        name = n;
        love = l;
        email = e;
    }
    @Override
    public String toString() {
        return id + " " + name + "" + love + " " + email;
    }
    @Override
    public int compareTo(Sinhvien b) {
        return id.compareTo(b.id);
    }
}
