package J05020;

public class SinhVien implements Comparable<SinhVien>{
    private String id, name, love, email;
    public SinhVien(String i, String n, String l, String e) {
        id = i;
        name = n;
        love = l;
        email = e;
    }
    @Override
    public int compareTo(SinhVien b) {
        if (love.equals(b.love))
            return id.compareTo(b.id);
        return love.compareTo(b.love);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + love + " " + email;
    }
}
