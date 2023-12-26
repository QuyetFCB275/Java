import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 12/18/2023 9:51 AM
 * @Copyright T.may
 */
public class J08010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> ok = new LinkedHashMap<>();
        int maxx = 0;
        while (sc.hasNext()) {
             String s = sc.next();
             if (check(s)) {
                 if (s.length() == maxx) {
                     if (ok.containsKey(s)) {
                         ok.replace(s, ok.get(s) + 1);
                     }
                     else
                        ok.put(s, 1);
                 }
                 else if (s.length() > maxx) {
                     maxx = s.length();
                     ok.clear();
                     ok.put(s, 1);
                }
            }
        }
        for (String x : ok.keySet()) {
            System.out.println(x + " " + ok.get(x));
        }

    }
    private static boolean check(String s) {
        StringBuilder b = new StringBuilder(s).reverse();
        if (s.compareTo(b.toString()) == 0)
            return true;
        return false;
    }
}
