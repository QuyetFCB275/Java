package TN02012;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("A1", 10); hm.put("A4", 12); hm.put("A9", 14); hm.put("A16", 20);
        hm.put("B1", 10); hm.put("B4", 11); hm.put("J07049", 13); hm.put("B16", 16);
        hm.put("C1", 9); hm.put("C4", 10); hm.put("C9", 12); hm.put("C16", 14);
        hm.put("D1", 8); hm.put("D4", 9); hm.put("D9", 11); hm.put("D16", 13);

        HashMap<String, String> h = new HashMap<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            String a = sc.next(), b = sc.nextLine();
            h.put(a, b);
        }

        ArrayList<Employee> a = new ArrayList<>();
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            String id = sc.nextLine();
            int x = Integer.parseInt(id.substring(1, 3));
            x = x < 4 ? 1 : (x < 9 ? 4 : (x < 16 ? 9 : 16));
            int k = hm.get(String.valueOf(id.charAt(0)) + x);
            String name = sc.nextLine();
            long m1 = sc.nextLong();
            long day = sc.nextLong();
            a.add(new Employee(id, name, h.get(id.substring(3)), day*m1*k*1000));
        }
        for (Employee x : a) {
            System.out.println(x);
        }
    }
}
