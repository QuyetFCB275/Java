package J04012;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        long m = sc.nextLong();
        long d = sc.nextLong();
        sc.nextLine();
        String p = sc.nextLine();
        NhanVien a = new NhanVien(n, m, d, p);
        System.out.println(a);
        a.getPos();
    }
}
