import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Scanner;

public class J08024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger k = BigInteger.valueOf(n);
            BigInteger kq = BigInteger.valueOf(0);
            ArrayDeque<String> arr = new ArrayDeque<>();
            arr.add("9");
            while (!arr.isEmpty()) {
                String s = arr.getFirst();
                BigInteger a = new BigInteger(s);
                if (a.mod(k) == kq) {
                    System.out.println(s);
                    break;
                }
                arr.removeFirst();
                arr.addLast(s + "0");
                arr.addLast(s + "9");
            }
        }
    }
}
