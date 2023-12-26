package J07010;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("SV.in"));
        int t = sc.nextInt();
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=1; i<=t; i++) {
            sc.nextLine();
            arr.add(new SinhVien(i, sc.nextLine(), sc.next(), sc.next(), sc.nextDouble()));
        }
        for (SinhVien x : arr)
            System.out.println(x);
    }
}
