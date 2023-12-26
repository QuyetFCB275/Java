import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class J03020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> mp = new LinkedHashMap<>();
        int maxx = 0;
//        Ctrl + D để kết thúc luồng Input
        while (sc.hasNext()) {
            String s = sc.next();
            if (check(s)) {
                if (s.length() > maxx) {
                    mp.clear();
                    maxx = s.length();
                    mp.put(s, 1);
                }
                else if (s.length() == maxx) {
                    if (mp.containsKey(s)) {
                        int k = mp.get(s);
                        mp.replace(s, k+1);
                    }
                    else
                        mp.put(s, 1);
                }
            }
        }
        for (String x : mp.keySet()) {
            System.out.println(x + " " + mp.get(x));
        }
    }

    private static boolean check(String s) {
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }
}
