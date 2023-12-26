package J04021;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

class IntSet {
    HashSet hs = new HashSet<>();
    public IntSet() {
    }
    public IntSet(int a[]) {
        for (int x : a) {
            hs.add(x);
        }
    }

    public IntSet union(IntSet b) {
        IntSet c = new IntSet();
        this.hs.addAll(b.hs);
        c.hs = this.hs;
        return c;
    }
    @Override
    public String toString() {
        String res = "";
        ArrayList<Integer> arr = new ArrayList<>(hs);
        arr.sort(Comparator.naturalOrder());
        for (int x : arr) {
            res += x + " ";
        }
        return res;
    }
}