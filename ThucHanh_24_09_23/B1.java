package ThucHanh24_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            ArrayList<Character> arr = new ArrayList<>();
            int sum=0;
            for (Character x : s.toCharArray()) {
                if (Character.isDigit(x))
                    sum += (x - '0');
                else
                    arr.add(x);
            }
            Collections.sort(arr);
            for (Character x : arr)
                System.out.print(x);
            System.out.println(sum);
        }
    }
}
