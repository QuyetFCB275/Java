package J07050;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATHANG.in"));
        int t = sc.nextInt();
        ArrayList<Product> a = new ArrayList<>();
        for (int i=1; i<=t; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String kind = sc.nextLine();
            double mua = sc.nextDouble();
            double ban = sc.nextDouble();
            a.add(new Product(i, name, kind, mua, ban));
        }
        Collections.sort(a);
        for (Product x : a) {
            System.out.println(x);
        }
    }
}