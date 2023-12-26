package J07019;

/**
 * @author QuyetLD
 * @Package J07019
 * @date 12/13/2023 10:04 PM
 * @Copyright T.may
 */
public class Bill {
    private String id, name;
    private int cnt, cost;

    public Bill(String id, String name, int cnt, int cost) {
        this.id = id;
        this.name = name;
        this.cnt = cnt;
        this.cost = cost;
    }

    public int sum_money() {
        return cnt*cost;
    }
    public int dis_money() {
        if (cnt >= 150)
            return sum_money() / 2;
        else if (cnt >= 100) {
            return sum_money() * 30 / 100;
        } else if (cnt >= 50) {
            return sum_money() * 15 / 100;
        }
        return 0;
    }
    public int pay_money() {
        return sum_money() - dis_money();
    }
    @Override
    public String toString() {
        return id + " " + name + " " + dis_money() + " " + pay_money();
    }
}
