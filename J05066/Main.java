package J05066;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> v = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String id = sc.next();
            String name = sc.nextLine().trim();
            String s1 = id.substring(0, 2);
            String s2 = id.substring(2, 4);
            String s3 = id.substring(4, 7);
            int num = Integer.parseInt(s3);
            if (s1.equals("GD")) {
                if (num == 1) {
                    v.add(new Employee(name, "GD", s3, s2));
                }
                else
                    v.add(new Employee(name, "NV", s3, s2));
            }
            else if (s1.equals("TP")) {
                if (num <= 3) {
                    v.add(new Employee(name, "TP", s3, s2));
                }
                else
                    v.add(new Employee(name, "NV", s3, s2));
            }
            else if (s1.equals("PP")) {
                if (num <= 3) {
                    v.add(new Employee(name, "PP", s3, s2));
                }
                else
                    v.add(new Employee(name, "NV", s3, s2));
            }
            else
                v.add(new Employee(name, "NV", s3, s2));
        }
        Collections.sort(v);
        int q = sc.nextInt();
        sc.nextLine();
        while (q-- > 0) {
            String s = sc.nextLine().trim().toLowerCase();
            for (Employee x : v) {
                if (x.getName().toLowerCase().contains(s)) {
                    System.out.println(x);
                }
            }
        }
    }
}
