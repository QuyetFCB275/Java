package J07035;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package J07035
 * @date 12/18/2023 3:15 PM
 * @Copyright T.may
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Student> hs = new HashMap<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String love = sc.nextLine();
            String mail = sc.nextLine();
            hs.put(id, new Student(id, name, love, mail));
        }
        sc = new Scanner(new File("MONHOC.in"));
        n = Integer.parseInt(sc.nextLine());
        HashMap<String, Monhoc> hs2 = new HashMap<>();
        while (n-- > 0) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String k = sc.nextLine();
            hs2.put(id, new Monhoc(id, name, k));
        }
        ArrayList<Bangdiem> arr = new ArrayList<>();
        sc = new Scanner(new File("BANGDIEM.in"));
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String id = sc.next();
            String idd = sc.next();
            String diem = sc.next();
            arr.add(new Bangdiem(hs.get(id), hs2.get(idd), diem));
        }
        Collections.sort(arr);
        int m = sc.nextInt();
        while (m-- > 0) {
            String id = sc.next();
            System.out.println("BANG DIEM MON " + hs2.get(id).getName() + ":");
            for (Bangdiem x : arr)
                if (x.getId().compareTo(id) == 0)
                    System.out.println(x);
        }
    }
}
