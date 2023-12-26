package J06002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Product> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            a.add(new Product(sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong()));
        }
        ArrayList<Bill> b = new ArrayList<>();
        int m = sc.nextInt();
        for (int i=1; i<=m; i++) {
            String s = sc.next();
            long count = sc.nextLong();
            for (Product x : a) {
                if (x.getId().equals(s.substring(0, 2))) {
                    String id = s + "-" + String.format("%03d", i);
                    int k = s.charAt(2) - '0';
                    long cost;
                    if (k == 1)
                        cost = x.getM1();
                    else
                        cost = x.getM2();
                    b.add(new Bill(id, x.getName(), count, cost));
                }
            }
        }
        Collections.sort(b);
        for (Bill x : b)
            System.out.println(x);
    }
}
