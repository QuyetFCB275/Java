package ThucHanh_15_10_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class B3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> se = new TreeSet<>();
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().trim().split("\\s++");
            for (String x : arr)
                if (check(x))
                    se.add(x);
        }
        for (String x : se)
            System.out.println(x);
    }

    private static boolean check(String x) {
        for (int i=0; i<x.length(); i++)
            if (Character.isDigit(x.charAt(i)))
                return false;
        return true;
    }
}
