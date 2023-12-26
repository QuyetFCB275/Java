package J06007;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            sc.nextLine();
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
            sc.next();
            float k = sc.nextFloat();
            hs.get(id).update(k);
        }
        for (GV x : arr)
            System.out.println(x);
    }
}
