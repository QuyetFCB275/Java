package J07009;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

public class IntSet {
    HashSet<Integer> hs = new HashSet<>();
    public IntSet(int a[]) throws IOException {
        for (int x : a) {
            hs.add(x);
        }
    }
    public IntSet intersection(IntSet b) {
        b.hs.retainAll(this.hs);
        return b;
    }
    @Override
    public String toString() {
        ArrayList<Integer> arr = new ArrayList<>(hs);
        arr.sort(Comparator.naturalOrder());
        String ans = "";
        for (int x : arr) {
            ans += x + " ";
        }
        return ans;
    }
}
