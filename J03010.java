import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J03010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        ArrayList<String> a = new ArrayList<>();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase().trim();
            String[] arr = s.split("\\s+");
            String res = arr[arr.length-1];
            for (int i=0; i< arr.length-1; i++) {
                res += arr[i].charAt(0);
            }
            a.add(res);
            int sum = Collections.frequency(a, res);
            res += (sum == 1 ? "" : sum) + "@ptit.edu.vn";
            System.out.println(res);
        }
    }
}
