package J07036;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J07036
 * @date 11/22/2023 10:24 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        HashMap<String, Sinhvien> hs1 = new HashMap<>();
        int t = sc.nextInt(); sc.nextLine();
        while (t-- > 0) {
            String id = sc.nextLine();
            String[] s = sc.nextLine().trim().toLowerCase().split("\\s++");
            String name = "";
            for (String x : s)
                name += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
            name = name.trim();
            String love = sc.nextLine();
            String email = sc.nextLine();
            hs1.put(id, new Sinhvien(id, name, love, email));
        }

        sc = new Scanner(new File("MONHOC.in"));
        HashMap<String, String> hs2 = new HashMap<>();
        t = sc.nextInt(); sc.nextLine();
        while (t-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String count = sc.nextLine();
            hs2.put(id, name);
        }

        sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Bangdiem> van = new ArrayList<>();
        t = sc.nextInt();
        while (t-- > 0) {
            String id_n = sc.next();
            String id = sc.next();
            String score = sc.next();

            Sinhvien a = hs1.get(id_n);
            String sub = hs2.get(id);
            van.add(new Bangdiem(id_n, a.getName(), id, sub, score, a.getLove()));
        }
        Collections.sort(van);

        t = sc.nextInt();
        while (t-- > 0) {
            String love = sc.next();
            System.out.println("BANG DIEM lop " + love + ":");
            for (Bangdiem x : van) {
                if (x.getLove().equals(love))
                    System.out.println(x);
            }
        }
    }
}
