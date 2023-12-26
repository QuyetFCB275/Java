package ThucHanh_24_09_23.B15;

import java.util.TreeSet;

class WordSet {
    private TreeSet<String> se = new TreeSet<>();
    public WordSet(String s) {
        String[] a = s.trim().toLowerCase().split("\\s++");
        for (String x : a)
            se.add(x);
    }

    public String union(WordSet s2) {
        TreeSet<String> res = new TreeSet<>();
        res.addAll(se);
        res.addAll(s2.se);
        String ans = "";
        for (String x : res)
            ans += x + " ";
        return ans;
    }

    public String intersection(WordSet s2) {
        TreeSet<String> res = new TreeSet<>();
        res.addAll(se);
        String ans = "";
        for (String x : res) {
            if (s2.se.contains(x)) {
                ans += x + " ";
            }
        }
        return ans;
    }

}
