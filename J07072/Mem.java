package J07072;

public class Mem implements Comparable<Mem>{
    private String ten, dem, ho;
    public Mem(String t, String d, String h) {
        ten = t;
        dem = d;
        ho = h;
    }
    @Override
    public int compareTo(Mem b) {
        if (ten.equals(b.ten)) {
            if (ho.equals(b.ho))
                return dem.compareTo(b.dem);
            else
                ho.compareTo(b.ho);
        }
        return ten.compareTo(b.ten);
    }
    @Override
    public String toString() {
        return ho + " " + dem + "" + ten;
    }
}
