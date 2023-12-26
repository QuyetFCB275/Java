package J05033;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Time> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            Time v = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            a.add(v);
        }
        Collections.sort(a);
        for (Time x : a)
            System.out.println(x);
    }
}