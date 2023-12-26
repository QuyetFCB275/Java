import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class J08020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Character, Integer> hs = new HashMap<>();
        hs.put('(', 1);
        hs.put(')', 9);
        hs.put('[', 2);
        hs.put(']', 8);
        hs.put('{', 3);
        hs.put('}', 7);

        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            ArrayDeque<Integer> arr = new ArrayDeque<>();
            for (int i=0; i<s.length(); i++) {
                if (arr.isEmpty()) {
                    arr.push(hs.get(s.charAt(i)));
                }
                else if (arr.peek() + hs.get(s.charAt(i)) == 10) {
                    arr.pop();
                }
                else
                    arr.push((hs.get(s.charAt(i))));
            }
            if (arr.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
