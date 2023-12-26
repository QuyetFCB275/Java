package ThucHanh_15_10_23.B8;

public class SinhVien implements Comparable<SinhVien>{
    private String id, name, gv, sub, phone;
    public SinhVien(String i, String n, String g, String s, String p) {
        id = i;
        name = n;
        gv = g;
        sub = s;
        phone = p;
    }

    public String getId() {
        return id;
    }

    public void setGv(String gv) {
        this.gv = gv;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    @Override
    public int compareTo(SinhVien b) {
        return id.compareTo(b.id);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + gv + "" + sub + "0" + phone;
    }
}
