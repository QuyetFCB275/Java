package ThucHanh_15_10_23.B7;

public class SinhVien implements Comparable<SinhVien>{
    private String id, name, love, email, sdt;
    public SinhVien(String i, String n, String l, String e, String s) {
        id = i;
        name = n;
        love = l;
        email = e;
        sdt = s;
    }
    @Override
    public int compareTo (SinhVien b) {
        if (love.equals(b.love))
            return id.compareTo(b.id);
        return love.compareTo(b.love);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + love + " " + email + " 0" + sdt;
    }
}
