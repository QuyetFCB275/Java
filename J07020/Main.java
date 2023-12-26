package J07020;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J07020
 * @date 12/13/2023 10:29 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Customer> hs = new HashMap<>();
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%03d", i);
            String name = sc.nextLine();
            String sex = sc.nextLine();
            String date = sc.nextLine();
            String add = sc.nextLine();
            hs.put(id, new Customer(id, name, sex, date, add));
        }
        sc = new Scanner(new File("MH.in"));
        n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> hs2 = new HashMap<>();
        for (int i=1; i<=n; i++) {
            String id = "MH" + String.format("%03d", i);
            String name = sc.nextLine();
            String dv = sc.nextLine();
            int mua = Integer.parseInt(sc.nextLine());
            int ban = Integer.parseInt(sc.nextLine());
            hs2.put(id, new Product(id, name, dv, mua, ban));
        }

        ArrayList<Bill> arr = new ArrayList<>();
        sc = new Scanner(new File("HD.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i=1; i<=n; i++) {
            String id = "HD" + String.format("%03d", i);
            String id_kh = sc.next();
            String id_mh = sc.next();
            int cnt = Integer.parseInt(sc.next());
            arr.add(new Bill(id, hs.get(id_kh), hs2.get(id_mh), cnt));
        }
        for (Bill x : arr)
            System.out.println(x);
    }
}
