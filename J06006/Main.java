package J06006;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> a = new ArrayList<>();
        HashMap<String, Customer> a1 = new HashMap<>();

        ArrayList<Product> b = new ArrayList<>();
        HashMap<String, Product> b1 = new HashMap<>();

        ArrayList<Bill> c = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++) {
            String id = "KH" + String.format("%03d", i);
            Customer x = new Customer(id, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.add(x);
            a1.put(id, x);
        }
        int m = sc.nextInt();
        for (int i=1; i<=m; i++) {
            sc.nextLine();
            String id = "MH" + String.format("%03d", i);
            Product x = new Product(id, sc.nextLine(), sc.nextLine(), sc.nextLong(), sc.nextLong());
            b.add(x);
            b1.put(id, x);
        }

        ArrayList<Bill> van = new ArrayList<>();
        int q = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=q; i++) {
            String id = "HD" + String.format("%03d", i);

            String v1 = sc.next(), v2 = sc.next();
            int v3 = sc.nextInt();
            Customer q1 = a1.get(v1);
            Product q2 = b1.get(v2);
            Bill x = new Bill(id, q1, q2, v3);
            van.add(x);
        }
        Collections.sort(van);
        for (Bill x : van)
            System.out.println(x);
    }
}