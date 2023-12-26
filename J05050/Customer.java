package J05050;

import java.util.HashMap;

/**
 * @author QuyetLD
 * @Package J05050
 * @date 12/18/2023 8:04 PM
 * @Copyright T.may
 */
public class Customer {
    private String id;
    int cnt, k;

    public Customer(String id, int cnt, int k) {
        this.id = id;
        this.cnt = cnt;
        this.k = k;
    }
    public int m1() {
        return cnt * k * 550;
    }
    public int m2() {
        double x = cnt < 50 ? 0 : (cnt <= 100 ? ((double) (m1() * 35) / 100) : m1());
        return (int) Math.round(x);
    }
    public int m() {
        return m1() + m2();
    }
    @Override
    public String toString() {
        return id + " " + k + " " + m1() + " " + m2() + " " + m();
    }
}
