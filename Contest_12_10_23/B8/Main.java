package Contest_12_10_23.B8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            LinkedHashMap<Long, Long> hs = new LinkedHashMap<>();
            ArrayList<Pair> a = new ArrayList<>();
            int n = sc.nextInt();
            for (int i=0; i<n; i++) {
                long x = sc.nextLong();
                if (hs.containsKey(x))
                    hs.replace(x, hs.get(x) + 1);
                else
                    hs.put(x,(long) 1);
            }
            for (Long x : hs.keySet()) {
                a.add(new Pair(x, hs.get(x)));
            }
            Collections.sort(a);
            for (Pair x : a)
                System.out.println(x);
        }
    }
}
