package J05016;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J05016
 * @date 12/17/2023 10:33 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> van = new ArrayList<>();
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(1, 25);
        hs.put(2, 34);
        hs.put(3, 50);
        hs.put(4, 80);
        int n = Integer.parseInt(sc.nextLine());
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%02d", i);
            String name = sc.nextLine().trim();
            String room = sc.nextLine().trim();
            String x1 = sc.nextLine().trim();
            String x2 = sc.nextLine().trim();
            int k = Integer.parseInt(sc.nextLine());
            LocalDate d1 = LocalDate.of(Integer.parseInt(x1.substring(6)), Integer.parseInt(x1.substring(3, 5)), Integer.parseInt(x1.substring(0, 2)));
            LocalDate d2 = LocalDate.of(Integer.parseInt(x2.substring(6)), Integer.parseInt(x2.substring(3, 5)), Integer.parseInt(x2.substring(0, 2)));
            int day = (int) ChronoUnit.DAYS.between(d1, d2) + 1;
            int money = day * hs.get(room.charAt(0) - '0') + k;
            van.add(new Customer(id, name, room, day, money));
        }
        Collections.sort(van);
        for (Customer x : van)
            System.out.println(x);
    }
}
