package J05007;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<NhanVien> arr = new ArrayList<>();
        for (int i=1; i<=t; i++) {
            NhanVien a = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            if (i < 10)
                a.id += "0" + i;
            else
                a.id += i;
            arr.add(a);
        }

        Collections.sort(arr);
        for (NhanVien x : arr) {
            System.out.println(x);
        }
    }
}