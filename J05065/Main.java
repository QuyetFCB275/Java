package J05065;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<NhanVien> a = new ArrayList<>();
        int d1=0, d2=0, d3=0;
        while (n-- > 0) {
            String s = sc.next();
            String na = sc.nextLine().substring(1);
            String pos = s.substring(0, 2);
            String rank = s.substring(2, 4);
            String id = s.substring(4);
            if (pos.equals("GD")) {
                if (d1 < 1) {
                    a.add(new NhanVien(na, "GD", rank, id));
                    d1++;
                }
                else
                    a.add(new NhanVien(na, "NV", rank, id));
            }
            else if (pos.equals("TP")) {
                if (d2 < 3) {
                    a.add(new NhanVien(na, "TP", rank, id));
                    d2++;
                }
                else
                    a.add(new NhanVien(na, "NV", rank, id));
            }
            else if (pos.equals("PP")) {
                if (d3 < 3) {
                    a.add(new NhanVien(na, "PP", rank, id));
                    d3++;
                }
                else
                    a.add(new NhanVien(na, "NV", rank, id));
            }
            else
                a.add(new NhanVien(na, "NV", rank, id));
        }
        Collections.sort(a);
        int q = sc.nextInt();
        while (q-- > 0) {
            String res = sc.next();
            for (NhanVien x : a) {
                if (x.getPos().equals(res))
                    System.out.println(x);
            }
            System.out.println();
        }
    }
}