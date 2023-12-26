package J04015;

public class GiaoVien {
    private String id, name;
    private long money;
    public GiaoVien (String i, String n, long m) {
        id = i;
        name = n;
        money = m;
    }
    public int getBac() {
        return Integer.parseInt(id.substring(2));
    }
    public long getphucap() {
        String s = id.substring(0, 2);
        if (s.equals("HT"))
            return 2000000;
        else if (s.equals("HP"))
            return 900000;
        return 500000;
    }
    public long thunhap() {
        return money * getBac() + getphucap();
    }
    public String toString() {
        return id + " " + name + " " + getBac() + " " + getphucap() + " " + thunhap();
    }
}