package J05017;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Customer> a = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%02d", i);
            sc.nextLine();
            String name = sc.nextLine();
            int k1 = sc.nextInt();
            int k2 = sc.nextInt();
            int k = k2-k1;
            float money=0;
            if (k <= 50) {
                money = (float) (k* 100* 1.02);
            } else if (k <= 100) {
                money = (float) (50* 100* 1.03) + (float) ((k-50)* 150* 1.03);
            } else {
                money = (float) (50* 100* 1.05) + (float) (50* 150* 1.05) + (float) ((k-100)* 200 *1.05);
            }
            a.add(new Customer(id, name, money));
        }
        Collections.sort(a, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o2.getMoney() - o1.getMoney());
            }
        });
        for (Customer x : a)
            System.out.println(x);
    }
}
