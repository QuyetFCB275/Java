package ThucHanh24_9.B10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> van = new ArrayList<>();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            van.add(new SinhVien(sc.nextLine(), sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(van);
        for (SinhVien x : van)
            System.out.println(x);
    }
}
