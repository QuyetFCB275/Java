package J07072;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Mem> van = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] a = sc.nextLine().toLowerCase().trim().split("\\s++");
            String ten = a[a.length-1].substring(0, 1).toUpperCase() + a[a.length-1].substring(1).toLowerCase();
            String ho = a[0].substring(0, 1).toUpperCase() + a[0].substring(1).toLowerCase();
            String dem = "";
            for (int i=1; i<a.length-1; i++)
                dem += a[i].substring(0, 1).toUpperCase() + a[i].substring(1).toLowerCase() + " ";
            van.add(new Mem(ten, dem ,ho));
        }
        Collections.sort(van);
        for (Mem x : van)
            System.out.println(x);
    }
}
