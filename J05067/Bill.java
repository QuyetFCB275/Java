package J05067;

/**
 * @author QuyetLD
 * @Package J05067
 * @date 12/18/2023 10:51 PM
 * @Copyright T.may
 */
public class Bill {
    private String id, name;
    private long cost, cnt, thue;

    public Bill(String id, String name, long cost, long cnt, long thue) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.cnt = cnt;
        this.thue = thue;
    }

    public long m1() {
        return cnt * thue;
    }
    public long m2() {
        return cost * cnt + m1();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + cost + " " + m1() + " " + m2();
    }
}
