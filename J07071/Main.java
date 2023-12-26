package J07071;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<person> arr = new ArrayList<>();
        while (n-- > 0) {
            String s = sc.nextLine();
            String[] a = s.split(" ");
            String id = "", fname = "", lname = "";
            for (int i=0; i<a.length-1; i++) {
                lname += a[i] + " ";
                id += a[i].charAt(0) + ".";
            }
            fname = a[a.length-1];
            id += a[a.length-1].charAt(0);
            arr.add(new person(id, fname, lname));
        }
        Collections.sort(arr, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                if (o1.getFname().equals(o2.getFname()))
                    return o1.getLname().compareTo(o2.getLname());
                return o1.getFname().compareTo(o2.getFname());
            }
        });
        int m = sc.nextInt();
        sc.nextLine();
        while (m-- > 0) {
            String a = sc.nextLine();
            for (person x : arr) {
                if (check(x.getId(), a))
                    System.out.println(x.getLname() + x.getFname());
            }
        }
    }
    private static boolean check(String id, String a) {
        if (id.length() != a.length())
            return false;
        int k=0;
        for (int i=0; i<id.length(); i++) {
            if (id.charAt(i) != a.charAt(i))
                k++;
        }
        return k == 1;
    }
}