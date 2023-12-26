package ThucHanh24_9.B6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Bill> van = new ArrayList<>();
        for (int i=0; i<t; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            String id = sc.nextLine();
            long cost = sc.nextLong();
            long count = sc.nextLong();
            int k = Integer.parseInt(id.substring(4));
            long sum = cost * count;
            long dis, money;
            if (k == 1)
                dis = sum * 50 / 100;
            else
                dis = sum * 30 / 100;
            money = sum - dis;
            van.add(new Bill(name, id, id.substring(1, 4), dis, money));
        }
        for (Bill x : van)
            System.out.println(x);
    }
}