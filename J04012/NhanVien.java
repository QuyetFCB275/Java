package J04012;

public class NhanVien {
    private String id, name, pos;
    private long money, day;
    public NhanVien(String n, long m, long d, String p) {
        id = "NV01";
        name = n;
        pos = p;
        money = m;
        day = d;
    }
    public long getThuong() {
        if (day >= 25)
            return  money * day / 5;
        if (day >= 22)
            return money * day / 10;
        return 0;
    }
    public long getPhucap() {
        if (pos.equals("GD"))
            return 250000;
        else if (pos.equals("PGD"))
            return 200000;
        else if (pos.equals("TP"))
            return 180000;
        else return 150000;
    }

    public String getPos() {
        return pos;
    }

    public String toString() {
        return id + " " + name + " " + money*day + " " + getThuong() + " " + getPhucap() + " " + (money*day + getPhucap() + getThuong());
    }
}
