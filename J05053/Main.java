package J05053;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J05053
 * @date 12/17/2023 9:26 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bill> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            String name = sc.nextLine();
            String id = sc.nextLine();
            int cost = Integer.parseInt(sc.nextLine());
            int cnt = Integer.parseInt(sc.nextLine());
            arr.add(new Bill(name, id, cost, cnt));
        }
        Collections.sort(arr);
        for (Bill x : arr)
            System.out.println(x);
    }
}
