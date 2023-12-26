package Contest_12_10_23.B4;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> se = new TreeSet<>();
    public IntSet() {}
    public IntSet(int[] a) {
        for (Integer x : a)
            se.add(x);
    }
    public IntSet union(IntSet b) {
        IntSet ans = new IntSet();
        ans.se.addAll(se);
        ans.se.addAll(b.se);
        return ans;
    }
    @Override
    public String toString() {
        String ans = "";
        for (Integer x : se)
            ans += x + " ";
        return ans;
    }
}
