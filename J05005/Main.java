package J05005;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            sc.nextLine();
            SinhVien x = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            x.solve();
            a.add(x);
        }
        Collections.sort(a);
        for (SinhVien x : a)
            System.out.println(x);
    }
}
