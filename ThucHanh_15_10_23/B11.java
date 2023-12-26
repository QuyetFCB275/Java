package ThucHanh_15_10_23;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            ArrayDeque<String> van = new ArrayDeque<>();
            van.add("00");
            van.add("11");

            while (true) {
                ArrayList<String> ans = new ArrayList<>();

                while (!van.isEmpty()) {
                    String s = van.poll();
                    System.out.print(s + " ");
                    ans.add("0" + s + "0");
                    ans.add("1" + s + "1");
                }
                if (ans.get(0).length() > n)
                    break;
                Collections.sort(ans);
                van.addAll(ans);
            }
            System.out.println();
        }
    }
}
