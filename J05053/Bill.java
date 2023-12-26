package J05053;

/**
 * @author QuyetLD
 * @Package J05053
 * @date 12/17/2023 9:26 PM
 * @Copyright T.may
 */
public class Bill implements Comparable<Bill>{
    private String name, id;
    private int cost, cnt;

    public Bill(String name, String id, int cost, int cnt) {
        this.name = name;
        this.id = id;
        this.cost = cost;
        this.cnt = cnt;
    }
    public String getStt() {
        return this.id.substring(1, 4);
    }
    public int dis() {
        if (id.charAt(4) == '1')
            return cost * cnt / 2;
        else
            return cost * cnt * 30 / 100;
    }
    public int money() {
        return cost * cnt - dis();
    }
    @Override
    public int compareTo(Bill b) {
        return getStt().compareTo(b.getStt());
    }
    @Override
    public String toString() {
        return name + " " + id + " " + getStt() + " " + dis() + " " + money();
    }
}
