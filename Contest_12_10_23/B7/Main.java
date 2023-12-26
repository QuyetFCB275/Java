package Contest_12_10_23.B7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<MonHoc> a = new ArrayList<>();
        ArrayList<MonHoc> van = new ArrayList<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String k = sc.nextLine();
            if (a.contains(id))
                continue;
            MonHoc v = new MonHoc(id, name, k);
            van.add(v);
        }
        Collections.sort(van, new Comparator<MonHoc>() {
            @Override
            public int compare(MonHoc o1, MonHoc o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (MonHoc x : van)
            System.out.println(x);
    }
}
