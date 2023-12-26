package ThucHanh_15_10_23;


import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class B5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> van = new HashSet<>();
        TreeSet<String> se = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine().trim();
            String[] a = s.split("[ .,]++");
            for (String x : a)
                if (check(x))
                    se.add(x);
        }
        for (String x : se)
            System.out.println(x);
    }

    private static boolean check(String x) {
        if (x.length() != 8 || x.charAt(2) != ':' || x.charAt(5) != ':')
            return false;
        int hh = Integer.parseInt(x.substring(0, 2));
        int mm = Integer.parseInt(x.substring(3, 5));
        int ss = Integer.parseInt(x.substring(6));
        if (hh >= 24 || mm > 59 || ss > 59)
            return false;
        return true;
    }
}
