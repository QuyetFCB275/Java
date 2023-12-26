package J06004;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        ArrayList<String> van = new ArrayList<>(); // Lưu tên BTL
        for (int i=0; i<n; i++) {
            sc.nextLine();
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
            arr.add(a);
        }
        sc.nextLine();
        for (int i=0; i<m; i++) {
            String s = sc.nextLine();
            van.add(s);
        }
        Collections.sort(arr);
        for (SinhVien x : arr)
            System.out.printf(x + van.get(x.getGr() - 1) + "\n");
    }
}