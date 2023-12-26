package J05070;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Club> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            sc.nextLine();
            a.add(new Club(sc.nextLine(), sc.nextLine(), sc.nextLong()));
        }
        ArrayList<Match> van = new ArrayList<>();
        int q = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=q; i++) {
            String id = sc.next();
            long count = sc.nextLong();
            for (Club x : a) {
                if (x.getId().equals(id.substring(1, 3))) {
                    Match z = new Match(id, x.getName(), x.getCost() * count);
                    van.add(z);
                }
            }
        }
        Collections.sort(van);
        for (Match x : van)
            System.out.println(x);
    }
}