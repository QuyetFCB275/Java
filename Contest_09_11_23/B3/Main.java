package Contest_09_11_23.B3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package Contest_09_11_23.B3
 * @date 12/18/2023 9:50 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = sc.nextInt();
        ArrayList<Product> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            String name = sc.nextLine();
            int cost = sc.nextInt();
            int time = sc.nextInt();
            arr.add(new Product(id, name, cost, time));
        }
        Collections.sort(arr);
        for (Product x : arr)
            System.out.println(x);
    }
}
