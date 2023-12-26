import java.util.ArrayDeque;
import java.util.Scanner;

import static java.lang.Math.max;

public class J08021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            ArrayDeque<Integer> arr1 = new ArrayDeque<>();
            ArrayDeque<Character> arr2 = new ArrayDeque<>();
            String s = sc.next();
            for (int i=0; i<s.length(); i++) {
                if (arr2.isEmpty()) {
                    arr1.push(i);
                    arr2.push(s.charAt(i));
                } else if (arr2.peek() == '(' && s.charAt(i) == ')') {
                    arr1.pop();
                    arr2.pop();
                }
                else {
                    arr1.push(i);
                    arr2.push(s.charAt(i));
                }
            }
            arr1.push(s.length());
            int ans = 0;
            int a = arr1.peek(), b;
            arr1.pop();
            while (!arr1.isEmpty()) {
                b = a;
                a = arr1.peek();
                ans = max(ans, b - a - 1);
                arr1.pop();
            }
            ans = max(ans, a);
            System.out.println(ans);
        }
    }
}
