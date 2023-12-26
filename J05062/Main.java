package J05062;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        ArrayList<SinhVien> a = new ArrayList<>();
        ArrayList<Double> zan = new ArrayList<>();

        for (int i=0; i<n; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double gpa = sc.nextDouble();
            double d = sc.nextDouble();
            a.add(new SinhVien(name, gpa, d));
            zan.add(gpa);
        }

        Collections.sort(zan);
        double minn = zan.get(m-1);
        int dem=0;

        for (SinhVien x : a) {
            String stt = "";
            if (x.getGpa() < minn) {
                stt = "KHONG";
            }
            else {
                if (x.getGpa() >= 3.6 && x.getD() >= 90)
                    stt = "XUATSAC";
                else if (x.getGpa() >= 3.2 && x.getD() >= 80)
                    stt = "GIOI";
                else if (x.getGpa() >= 2.5 && x.getD() >= 70)
                    stt = "KHA";
                else
                    stt = "KHONG";
            }
            x.setStt(stt);
        }
        for (SinhVien x : a)
            System.out.println(x);
    }
}
