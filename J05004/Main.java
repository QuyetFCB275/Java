package J05004;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<SinhVien> zan = new ArrayList<>();
        for (int i=1; i<=t; i++){
            sc.nextLine();
            SinhVien a = new SinhVien(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a.solve();
            zan.add(a);
        }
        for (SinhVien x : zan)
            System.out.println(x);
    }
}