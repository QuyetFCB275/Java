package Contest_09_11_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class B1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> ans = new TreeSet<>();
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            String[] arr = s.trim().split("\\s++");
            for (String x : arr) {
                if (check(x))
                    ans.add(x);
            }
        }
        for (String x : ans)
            System.out.println(x);
    }
    private static boolean check(String s) {
        int k = 0;
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == ',' || s.charAt(i) == '?' || s.charAt(i) == '!' || s.charAt(i) == ':')
                return false;
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9')
                k++;
        }
        return k >= 1;
    }
}
