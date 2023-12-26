package J07046;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%02d", i);
            String name = sc.nextLine();
            String room = sc.nextLine();
            String d1 = sc.nextLine();
            String d2 = sc.nextLine();

            LocalDate day1 = LocalDate.of(Integer.parseInt(d1.substring(6)), Integer.parseInt(d1.substring(3, 5)), Integer.parseInt(d1.substring(0, 2)));
            LocalDate day2 = LocalDate.of(Integer.parseInt(d2.substring(6)), Integer.parseInt(d2.substring(3, 5)), Integer.parseInt(d2.substring(0, 2)));
            int sum_day = (int) ChronoUnit.DAYS.between(day1, day2);
            arr.add(new Customer(id, name, room, sum_day));
        }
        Collections.sort(arr);
        for (Customer x : arr)
            System.out.println(x);
    }
}
