package J07027;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("STRING.in"));
        Scanner in2 = new Scanner(new File("BAITAP.in"));
        Scanner in3 = new Scanner(new File("NHOM.in"));

        ArrayList<SinhVien> van = new ArrayList<>();
        HashMap<String, SinhVien> hs = new HashMap<>();
        int n = in1.nextInt();
        in1.nextLine();
        for (int i=0; i<n; i++) {
            String id = in1.nextLine();
            String name = in1.nextLine();
            String phone = in1.nextLine();
            SinhVien a = new SinhVien(id, name, phone);
            van.add(a);
            hs.put(id, a);
        }

        ArrayList<String> arr = new ArrayList<>();
        int m = in2.nextInt();
        in2.nextLine();
        for (int i=0; i<m; i++) {
            arr.add(in2.nextLine());
        }

        for (int i=0; i<n; i++) {
            String id = in3.next();
            int gr = in3.nextInt();
            SinhVien zan = hs.get(id);
            String subject = arr.get(gr - 1);
            zan.setSubject(subject);
            zan.setGr(gr);
        }

        Collections.sort(van);
        for (SinhVien x : van)
            System.out.println(x);
    }
}
