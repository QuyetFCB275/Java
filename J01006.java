import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long[] a = new long[95];
        a[1] = a[2] = 1;
        for (int i=3; i < 95; i++) {
            a[i] = a[i-2] + a[i-1];
        }
        int n = sc.nextInt();
        while(n-- > 0) {
            int k = sc.nextInt();
            System.out.println(a[k]);
        }
    }
}
