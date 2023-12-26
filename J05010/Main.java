package J05010;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Product> a = new ArrayList<>();
        for (int i=1; i<=t; i++) {
            sc.nextLine();
            String id = String.valueOf(i);
            String name = sc.nextLine();
            String kind = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            a.add(new Product(id, name, kind, mua, ban));
        }
        Collections.sort(a);
        for (Product x : a) {
            System.out.println(x);
        }
    }
}
