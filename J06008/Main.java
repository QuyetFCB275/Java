package J06008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, String> h = new HashMap<>();
        while (n-- > 0) {
            String id = sc.next();
            String sub = sc.nextLine().substring(1);
            h.put(id, sub);
        }

        HashMap<String, GV> hs = new HashMap<>();
        ArrayList<GV> arr = new ArrayList<>();
        n = sc.nextInt();
        while (n-- > 0) {
            String id = sc.next();
            String name = sc.nextLine().substring(1);
            GV a = new GV(name, 0);
            arr.add(a);
            hs.put(id, a);
        }

        n = sc.nextInt();
        while (n-- > 0) {
            String id = sc.next();
            String id_sub = sc.next();
            float k = sc.nextFloat();
            hs.get(id).update(h.get(id_sub), k);
        }
        String id = sc.next();
        hs.get(id).String();
    }
}
