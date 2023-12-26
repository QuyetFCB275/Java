package J04022;

import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private TreeSet<String> set;
    public WordSet(String s) {
        set = new TreeSet<>();
        String[] arr = s.toLowerCase().split("\\s++");
        for (String x : arr)
            set.add(x);
    }
    public WordSet union(WordSet s) {
        WordSet uni = new WordSet("");
        uni.set.addAll(s.set);
        uni.set.addAll(set);
        return uni;
    }

    public WordSet intersection(WordSet s) {
        WordSet inter = new WordSet("");
        inter.set.addAll(set);
        inter.set.retainAll(s.set);
        return inter;
    }
    @Override
    public String toString() {
        String ans = "";
        for (String x : set)
            ans += x + " ";
        return ans;
    }
}