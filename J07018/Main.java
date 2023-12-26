package J07018;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J07018
 * @date 12/13/2023 11:08 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien> arr = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String id = "B20DCCN" + String.format("%03d", i);
            String a[] = sc.nextLine().trim().toLowerCase().split("\\s++");
            String name = "";
            for (String x : a) {
                name += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
            }
            String love = sc .nextLine();
            String date = sc.nextLine();
            if (date.charAt(1) == '/')
                date = "0" + date;
            if (date.charAt(4) == '/')
                date = date.substring(0, 3) + "0" + date.substring(3);
            double gpa = Double.parseDouble(sc.nextLine());
            arr.add(new SinhVien(id, name, love, date, gpa));
        }
        for (SinhVien x : arr)
            System.out.println(x);
    }
}
