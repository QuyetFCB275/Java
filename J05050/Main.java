package J05050;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J05050
 * @date 12/18/2023 8:04 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String, Integer> hs = new HashMap<>();
        hs.put("KD", 3);
        hs.put("NN", 5);
        hs.put("TT", 4);
        hs.put("CN", 2);
        ArrayList<Customer> arr = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%02d", i);
            String x = sc.next();
            int cnt = -(sc.nextInt() - sc.nextInt());
            arr.add(new Customer(id, cnt, hs.get(x)));
        }
        for (Customer x : arr)
            System.out.println(x);
    }
}
