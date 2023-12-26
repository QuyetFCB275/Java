import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 12/18/2023 9:21 AM
 * @Copyright T.may
 */
public class JKT015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        ArrayDeque<Character> a = new ArrayDeque<>();
        ArrayDeque<Character> b = new ArrayDeque<>();
        for (Character x : s.toCharArray()) {
            switch (x) {
                case '-':
                    if (!a.isEmpty())
                        a.pop();
                    break;
                case '<':
                    if (!a.isEmpty())
                        b.push(a.pop());
                    break;
                case '>':
                    if (!b.isEmpty())
                        a.push(b.pop());
                    break;
                default:
                    a.push(x);
            }
        }
        while (!b.isEmpty()) {
            a.push(b.pop());
        }
        while (a.size() > 0) {
            System.out.print(a.getLast());
            a.pollLast();
        }
    }
}