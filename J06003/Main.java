package J06003;

import java.util.ArrayList;
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
        int q = sc.nextInt();
        while (q-- > 0) {
            int v = sc.nextInt();
            System.out.printf("DANH SACH NHOM %d:\n", v);
            for (SinhVien x : arr) {
                if (x.getGr() == v) {
                    System.out.println(x);
                }
            }
            System.out.printf("Bai tap dang ky: " + van.get(v-1));
            System.out.println();
        }
    }
}