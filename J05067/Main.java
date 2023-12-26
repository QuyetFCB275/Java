package J05067;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J05067
 * @date 12/18/2023 10:50 PM
 * @Copyright T.may
 */
public class Main {
    public static HashMap<String, Long> hs1 = new HashMap<>();
    public static HashMap<String, Long> hs2 = new HashMap<>();
    public static HashMap<String, String> hs3 = new HashMap<>();
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Bill> van = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.next();
            int cnt = Integer.parseInt(sc.next());
            long cost = hs1.get(id.substring(0, 1));
            long thue = hs2.get(id.substring(0, 1));
            String name = hs3.get(id.substring(3));
            if (name.equals("Trong Nuoc"))
                thue = 0;
            van.add(new Bill(id, name, cost, cnt, thue));
        }
        for (Bill x : van)
            System.out.println(x);
    }

    private static void init() {
        hs1.put("X", (long) 128000);
        hs1.put("D", (long) 11200);
        hs1.put("N", (long) 9700);

        hs2.put("X", (long) 3840);
        hs2.put("D", (long) 392);
        hs2.put("N", (long) 194);

        hs3.put("BP", "British Petro");
        hs3.put("ES", "Esso");
        hs3.put("SH", "Shell");
        hs3.put("CA", "Castrol");
        hs3.put("MO", "Mobil");
        hs3.put("TN", "Trong Nuoc");
    }
}
