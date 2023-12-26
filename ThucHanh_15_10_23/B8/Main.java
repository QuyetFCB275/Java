package ThucHanh_15_10_23.B8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<SinhVien> van = new ArrayList<>();
        HashMap<String, SinhVien> hs = new HashMap<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String love = sc.nextLine();
            String email = sc.nextLine();
            String phone = sc.nextLine();
            SinhVien a = new SinhVien(id, name, "", "", phone);
            van.add(a);
            hs.put(id, a);
        }

        Scanner sc1 = new Scanner(new File("HUONGDAN.in"));
        int n = sc1.nextInt();
        sc1.nextLine();
        for (int i=0; i<n; i++) {
            String[] arr = sc1.nextLine().trim().split(" ");

            String nameGV = "";
            for (int j=0; j<arr.length-1; j++)
                nameGV += arr[j] + " ";
            int k = Integer.parseInt(arr[arr.length-1]);

            for (int j=0; j<k; j++) {
                String[] q = sc1.nextLine().trim().split(" ");
                String id = q[0];
                String sub = "";
                for (int f = 1; f<q.length; f++)
                    sub += q[f] + " ";

                // Cách 1: (Không hay lắm)
//                for (SinhVien x : van) {
//                    if (x.getId().equals(id)) {
//                        x.setGv(nameGV);
//                        x.setSub(sub);
//                        break;
//                    }
//                }

                // Cách 2: (dùng HashMap để update)
                hs.get(id).setGv(nameGV);
                hs.get(id).setSub(sub);
            }
        }

        Collections.sort(van);
        for (SinhVien x : van)
            System.out.println(x);
    }
}
