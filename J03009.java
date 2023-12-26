import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class J03009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] a = sc.nextLine().trim().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> ans = new HashSet<>();
            for (String x : a) {
                if (!b.contains(x))
                    ans.add(x);
            }
            for (String x : ans)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
