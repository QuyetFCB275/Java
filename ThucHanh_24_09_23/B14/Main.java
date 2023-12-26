package ThucHanh_24_09_23.B14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new File("STRING.in"));
        Scanner in2 = new Scanner(new File("DETAI.in"));
        Scanner in3 = new Scanner(new File("NHIEMVU.in"));

        ArrayList<SinhVien> van = new ArrayList<>();
        HashMap<String, SinhVien> hs1 = new HashMap<>();
        int n = in1.nextInt();
        in1.nextLine();
        for (int i=0; i<n; i++) {
            String id = in1.nextLine();
            SinhVien a = new SinhVien(id, in1.nextLine(), in1.nextLine(), in1.nextLine());
            hs1.put(id, a);
            van.add(a);
        }

        HashMap<String, Detai> hs2 = new HashMap<>();
        int m = in2.nextInt();
        in2.nextLine();
        for (int i=1; i<=m; i++) {
            String id = "DT" + String.format("%03d", i);
            Detai a = new Detai(id, in2.nextLine(), in2.nextLine());
            hs2.put(id, a);
        }

        int q = in3.nextInt();
        for (int i=0; i<q; i++) {
            String id = in3.next();
            String idd = in3.next();
            SinhVien a = hs1.get(id);
            Detai b = hs2.get(idd);
            a.setNamegv(b.getNamegv());
            a.setNamesub(b.getName());
        }

        Collections.sort(van, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return o1.getNamesub().compareTo(o2.getNamesub());
            }
        });
        for (SinhVien x : van)
            System.out.println(x);
    }
}
