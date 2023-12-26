package Contest_09_11_23.B5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Monthi> hs1 = new HashMap<>();
        for (int i=0; i<t; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String kind = sc.nextLine();
            Monthi a = new Monthi(id, name, kind);
            hs1.put(id, a);
        }
        sc = new Scanner(new File("CATHI.in"));
        t = sc.nextInt();
        HashMap<String, Cathi> hs2 = new HashMap<>();
        for (int i=1; i<=t; i++) {
            String id = "C" + String.format("%03d", i);
            String date = sc.next();
            String time = sc.next();
            String idr = sc.next();
            Cathi a = new Cathi(id, date, time, idr);
            hs2.put(id, a);
        }

        ArrayList<Lichthi> arr = new ArrayList<>();
        sc = new Scanner(new File("LICHTHI.in"));
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String id_ca = sc.next();
            String id_mon = sc.next();
            String gr = sc.next();
            String sum = sc.next();

            String name = hs1.get(id_mon).getName();
            Cathi x = hs2.get(id_ca);
            String date = x.getDate();
            String time = x.getTime();
            String idr = x.getIdr();
            Lichthi q = new Lichthi(id_ca, date, time, idr, name, gr, sum);
            arr.add(q);
        }
        Collections.sort(arr);
        for (Lichthi x : arr)
            System.out.println(x);
    }
}
