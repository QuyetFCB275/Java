package J07049;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MUAHANG.in"));

        ArrayList<Product> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            int cost = sc.nextInt();
            int bh = sc.nextInt();
            a.add(new Product(id, name, cost, bh));
        }

        ArrayList<Customer> van = new ArrayList<>();

        int m = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=m; i++) {
            String id = "KH" + String.format("%02d", i);
            String name = sc.nextLine();
            String add = sc.nextLine();
            String idsp = sc.nextLine();

            int count = Integer.parseInt(sc.nextLine());

            String[] day = sc.nextLine().split("/");
            String dd = day[0];
            int mm = Integer.parseInt(day[1]);
            int yyyy = Integer.parseInt(day[2]);

            int cost=0, bh=0;
            for (Product x : a) {
                if (idsp.equals(x.getId())) {
                    cost = x.getCost();
                    bh = x.getBh();
                    break;
                }
            }

            int sum_money = count*cost;

            yyyy += bh / 12;
            mm += bh % 12;
            if (mm > 12) {
                yyyy += 1;
                mm -= 12;
            }
            String mm_string;
            if (mm == 0)
                mm_string = "12";
            else if (mm < 10) mm_string = "0" + mm;
            else
                mm_string = String.valueOf(mm);

            String day_end = dd + "/" + mm_string + "/" + yyyy;
            String cmp = yyyy + "" + mm_string + dd;

            van.add(new Customer(id, name, add, idsp, sum_money, day_end, cmp));
        }

        Collections.sort(van);
        for (Customer x : van)
            System.out.println(x);
    }
}
