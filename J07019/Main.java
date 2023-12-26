package J07019;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J07019
 * @date 12/13/2023 10:04 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> hs = new HashMap<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int m1 = Integer.parseInt(sc.nextLine());
            int m2 = Integer.parseInt(sc.nextLine());
            Product a = new Product(id, name, m1, m2);
            hs.put(id, a);
        }

        ArrayList<Bill> arr = new ArrayList<>();
        sc = new Scanner(new File("DATA2.in"));
        n = Integer.parseInt(sc.nextLine());
        for (int i=1; i<=n; i++) {
            String s = sc.next();
            int cnt = Integer.parseInt(sc.next());
            String id = s.substring(0, 2);
            Product a = hs.get(id);
            int k = s.charAt(2) - '0';
            int cost;
            if (k == 1)
                cost = a.getM1();
            else
                cost = a.getM2();
            arr.add(new Bill(s + String.format("-%03d", i), a.getName(), cnt, cost));
        }
        for (Bill x : arr)
            System.out.println(x);
    }
}
