package J06001;

import java.util.ArrayList;
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
        int q = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=q; i++) {
            String id = sc.next();
            long count = sc.nextLong();
            long cost;
            for (Product x : a) {
                if (x.getId().equals(id.substring(0, 2))) {
                    if (id.charAt(2) == '1')
                        cost = x.getM1();
                    else cost = x.getM2();
                    Bill zan = new Bill(i, id, count, cost, x.getName());
                    System.out.println(zan);
                    break;
                }
            }
        }
    }
}