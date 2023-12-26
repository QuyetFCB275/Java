package ThucHanh_24_09_23.B14;

public class SinhVien {
    private String id, name, sdt, email, namegv, namesub;
    public SinhVien(String i, String n, String s, String e) {
        id = i;
        name = n;
        sdt = s;
        email = e;
    }

    public void setNamegv(String namegv) {
        this.namegv = namegv;
    }

    public void setNamesub(String namesub) {
        this.namesub = namesub;
    }

    public String getNamesub() {
        return namesub;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + sdt + " " + email + " " + namegv + " " + namesub;
    }
}
