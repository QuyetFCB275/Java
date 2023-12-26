package J07007;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

class WordSet {
    private TreeSet<String> hs = new TreeSet<>();
    public WordSet(String s) throws IOException {
        Scanner sc = new Scanner(new File(s));
        while (sc.hasNextLine()) {
            String[] a = sc.nextLine().toLowerCase().split("\\s+");
            for (String x : a)
                hs.add(x);
        }
    }
    @Override
    public String toString() {
        String ans = "";
        for (String x : hs)
            ans += x + "\n";
        return ans;
    }
}