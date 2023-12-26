package J05079;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J05079
 * @date 12/18/2023 2:48 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Love> arr = new ArrayList<>();
        HashMap<String, String> hs = new HashMap<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String gr = sc.nextLine();
            String gv = sc.nextLine();
            arr.add(new Love(id, name, gr, gv));
            hs.put(id, name);
        }
        Collections.sort(arr);
        int m = sc.nextInt();
        while (m-- > 0) {
            String id = sc.next();
            System.out.println("Danh sach nhom lop mon " + hs.get(id) + ":");
            for (Love x : arr) {
                if (x.getId().equals(id)) {
                    System.out.println(x);
                }
            }
        }
    }
}
