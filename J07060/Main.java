package J07060;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J07060
 * @date 11/22/2023 3:10 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        HashMap<String, Monthi> hs1 = new HashMap<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i=0; i<t; i++) {
            String id = sc.nextLine();
            hs1.put(id, new Monthi(id, sc.nextLine(), sc.nextLine()));
        }

        sc = new Scanner(new File("CATHI.in"));
        HashMap<String, Cathi> hs2 = new HashMap<>();
        t = sc.nextInt();
        for (int i=1; i<=t; i++) {
            String id = "C" + String.format("%03d", i);
            hs2.put(id, new Cathi(sc.next(), sc.next(), sc.next()));
        }

        ArrayList<Lichthi> van = new ArrayList<>();
        sc = new Scanner(new File("LICHTHI.in"));
        t = sc.nextInt();
        while (t-- > 0) {
            String id_c = sc.next();
            String id_n = sc.next();
            String id_g = sc.next();
            String count = sc.next();

            Cathi a = hs2.get(id_c);
            String date = a.getDate();
            String hour = a.getHour();
            String id_r = a.getId_r();

            Monthi b = hs1.get(id_n);
            String name = b.getName();
            van.add(new Lichthi(date, hour, id_r, name, id_g, count));
        }
        Collections.sort(van);
        for (Lichthi x : van) {
            System.out.println(x);
        }
    }
}
