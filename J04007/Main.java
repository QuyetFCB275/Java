package J04007;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String sex = sc.nextLine();
        String date = sc.nextLine();
        String add = sc.nextLine();
        String thue = sc.nextLine();
        String day = sc.nextLine();
        NhanVien nv = new NhanVien(name, sex, date, add, thue, day);
        System.out.printf("%s %s %s %s %s %s %s", nv.id, nv.name, nv.sex, nv.date, nv.add, nv.thue, nv.day);
    }
}