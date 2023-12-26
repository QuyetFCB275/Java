package J05003;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<SinhVien> zan = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            SinhVien a = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextDouble());
            a.solve();
            if (i < 10)
                a.id += "0" + i;
            else
                a.id += i;
            zan.add(a);
            sc.nextLine();
        }
        for (SinhVien x : zan) {
            System.out.print(x);
            System.out.printf("%.2f\n", x.gpa);
        }
    }
}