package J05081;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<MH> a = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            MH van = new MH(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            if (i < 10)
                van.id += "0" + i;
            else
                van.id += String.valueOf(i);
            van.loinhuan = van.ban - van.mua;
            a.add(van);
            sc.nextLine();
        }
        Collections.sort(a);
        for (MH x : a)
            System.out.println(x);
    }
}