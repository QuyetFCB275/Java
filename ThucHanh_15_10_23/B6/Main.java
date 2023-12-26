package ThucHanh_15_10_23.B6;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        HashMap<String, Integer> hs = new HashMap<>();
        for (int i=1; i<=n; i++) {
            String use = sc.next();
            String pass = sc.next();
            User x = new User(use, pass);
            hs.put(x.toString(), i);
        }
        int m = sc.nextInt();
        for (int i=0; i<m; i++) {
            String use = sc.next();
            String pass = sc.next();
            User x = new User(use, pass);
            String s = x.toString();
            if (hs.containsKey(s)) {
                a[hs.get(s)]++;
            }
        }
        for (int i=1; i<=n; i++)
            System.out.print(a[i] + " ");
    }
}
