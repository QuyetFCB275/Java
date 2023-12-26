package J05081;

class MH implements Comparable<MH> {
    String id, name, dv;
    int mua, ban, loinhuan;
    public MH(String name, String dv, int m, int b) {
        this.id = "MH0";
        this.name = name;
        this.dv = dv;
        mua = m;
        ban = b;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + dv + " " + mua + " " + ban + " " + loinhuan;
    }
    @Override
    public int compareTo(MH o) {
        return o.loinhuan - loinhuan;
    }
}