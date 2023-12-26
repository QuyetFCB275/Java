package J05022;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> arr = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            arr.add(new Sinhvien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int q = sc.nextInt();
        while (q-- > 0) {
            String s = sc.next();
            System.out.println("DANH SACH SINH VIEN LOP " + s + ":");
            for (Sinhvien x : arr) {
                if (x.getLove().equals(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}
