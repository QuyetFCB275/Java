package J07048;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SANPHAM.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> van = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            int cost = Integer.parseInt(sc.nextLine());
            int time = Integer.parseInt(sc.nextLine());
            van.add(new Product(id, name, cost, time));
        }
        Collections.sort(van);
        for (Product x : van)
            System.out.println(x);
    }
}
