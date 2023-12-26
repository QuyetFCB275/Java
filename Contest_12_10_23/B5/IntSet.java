package Contest_12_10_23.B5;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> se = new TreeSet<>();
    public IntSet(){}
    public IntSet(int[] a) {
        for (Integer x : a) {
            se.add(x);
        }
    }
    @Override
    public String toString() {
        String ans="";
        for (Integer x : se)
            ans += x + " ";
        return ans;
    }
    public IntSet intersection(IntSet b) {
        IntSet ans = new IntSet();
        ans.se.addAll(se);
        ans.se.retainAll(b.se);
        return ans;
    }
    public IntSet different(IntSet b) {
        IntSet ans = new IntSet();
        ans.se.addAll(se);
        ans.se.removeAll(b.se);
        return ans;
    }
}
