package ThucHanh_15_10_23.B7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> van = new ArrayList<>();
        while (sc.hasNextLine()) {
            van.add(new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(van);
        for (SinhVien x : van)
            System.out.println(x);
    }
}
