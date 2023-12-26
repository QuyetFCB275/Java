package J07033;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Sinhvien> arr = new ArrayList<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String[] a = sc.nextLine().trim().toLowerCase().split("\\s++");
            String name = "";
            for (String x : a) {
                name += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
            }
            String love = sc.nextLine();
            String email = sc.nextLine();
            arr.add(new Sinhvien(id, name, love, email));
        }
        Collections.sort(arr);
        for (Sinhvien x : arr)
            System.out.println(x);
    }
}
