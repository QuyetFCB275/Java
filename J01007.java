import java.util.Arrays;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[95];
        a[0] = 0;
        a[1] = 1;
        for (int i=2; i < 95; i++) {
            a[i] = a[i-2] + a[i-1];
        }
        int t = sc.nextInt();
        while(t-- > 0) {
            long n = sc.nextLong();
            int index = Arrays.binarySearch(a, n);
            boolean ck = index >=0 ? true : false;
            if (ck)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}