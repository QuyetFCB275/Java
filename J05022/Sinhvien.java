package J05022;

public class Sinhvien {
    private String id, name, love, email;
    public Sinhvien(String i, String n, String l, String e) {
        id = i;
        name = n;
        love = l;
        email = e;
    }

    public String getLove() {
        return love;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + love + " " + email;
    }
}
