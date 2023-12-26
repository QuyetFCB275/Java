package J07056;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
//        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("A", 100);
        hs.put("B", 500);
        hs.put("C", 200);

        ArrayList<Customer> arr = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%02d", i);
            sc.nextLine();
            String[] a = sc.nextLine().trim().toLowerCase().split("\\s++");
            String name = "";
            for (String x : a) {
                name += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
            }
            String k = sc.next();
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            int count = x2 - x1;
            int q = hs.get(k);

            int m1, m2, thue;
            if (count <= q) {
                m1 = count * 450;
                m2 = 0;
            }
            else {
                m1 = q * 450;
                m2 = (count - q) * 1000;
            }
            thue = m2 * 5 / 100;
            Customer v = new Customer(id, name, m1, m2, thue);
            arr.add(v);
        }
        Collections.sort(arr);
        for (Customer x : arr) {
            System.out.println(x);
        }
    }
}

