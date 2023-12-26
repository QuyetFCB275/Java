package J05065;

public class NhanVien implements Comparable<NhanVien>{
    private String name, pos, rank, id;
    public NhanVien(String n, String p, String r, String i) {
        name = n;
        pos = p;
        rank = r;
        id = i;
    }

    public String getPos() {
        return pos;
    }

    @Override
    public int compareTo(NhanVien b) {
        if (!rank.equals(b.rank))
            return - rank.compareTo(b.rank);
        return id.compareTo(b.id);
    }
    @Override
    public String toString() {
        return name + " " + pos + " " + id + " " + rank;
    }
}