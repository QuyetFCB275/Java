package ThucHanh_15_10_23.B10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++)
            sc.nextLine();

        sc = new Scanner(new File("GIANGVIEN.in"));
        int m = sc.nextInt();
        ArrayList<GV> van = new ArrayList<>();
        for (int i=0; i<m; i++) {
            String id = sc.next();
            String name = sc.nextLine();
            van.add(new GV(id, name));
        }

        sc = new Scanner(new File("GIOCHUAN.in"));
        int p = sc.nextInt();
        for (int i=0; i<p; i++) {
            String id = sc.next();
            String mon = sc.next();
            float hour = sc.nextFloat();
            for (GV x : van)
                if (x.getId().equals(id)) {
                    x.update(hour);
                }
        }
        for (GV x : van)
            System.out.println(x);
    }
}
