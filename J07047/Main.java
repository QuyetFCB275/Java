package J07047;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int n = sc.nextInt();
        HashMap<String, Room> hs = new HashMap<>();
        for (int i=0; i<n; i++) {
            String k = sc.next();
            String name = sc.next();
            long cost = sc.nextLong();
            double ps = sc.nextDouble();
            Room a = new Room(k, name, cost, ps);
            hs.put(k, a);
        }

        ArrayList<Customer> van = new ArrayList<>();
        int m = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=m; i++) {
            String id = String.format("KH" + "%02d", i);
            String name = sc.nextLine();
            String kind = sc.nextLine();
            String d1 = sc.nextLine();
            String d2 = sc.nextLine();
            LocalDate date1 = LocalDate.of(Integer.parseInt(d1.substring(6)), Integer.parseInt(d1.substring(3, 5)), Integer.parseInt(d1.substring(0, 2)));
            LocalDate date2 = LocalDate.of(Integer.parseInt(d2.substring(6)), Integer.parseInt(d2.substring(3, 5)), Integer.parseInt(d2.substring(0, 2)));
            long day = date1.until(date2, ChronoUnit.DAYS);
            if (day == 0)
                day = 1;
            String k = kind.substring(2, 3);
            Room z = hs.get(k);
            long cost = z.getCost();
            double ps = z.getPs();
            double money;
            if (day > 0)
                money = day * cost * (1 + ps) * 1.0;
            else {
                money = 1 * cost * (1 + ps) * 1.0;
            }
            if (day < 10) {}
            else if (day < 20)
                money = money * 98 / 100;
            else if (day < 30)
                money = money * 96 / 100;
            else
                money = money * 94 / 100;
            van.add(new Customer(id, name, kind, day, money));
        }
        Collections.sort(van, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o2.getDay() - o1.getDay());
            }
        });
        for (Customer x : van) {
            System.out.println(x);
        }
    }
}
