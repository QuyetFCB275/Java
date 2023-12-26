import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class JKT013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayDeque<String> arr = new ArrayDeque<>();
            arr.add("6");
            arr.add("8");
            ArrayList<String> a = new ArrayList<>();
            a.add("6");
            a.add("8");
            while (true) {
                String s = arr.getFirst();
                arr.pop();
                if (s.length() + 1 > n)
                    break;
                arr.add(s + "6");
                arr.add(s + "8");
                a.add(s + "6");
                a.add(s + "8");
            }
            System.out.println(a.size());
            Collections.reverse(a);
            for (String x : a)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
