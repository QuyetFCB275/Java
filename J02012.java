import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class J02012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++) {
            System.out.printf("Buoc %d: ", i);
            int x = a[i], k=0;
            while (a[k] < x)
                k++;
            for (int j=i; j>k; j--) {
                a[j] = a[j-1];
            }
            a[k] = x;
            for (int j=0; j<=i; j++) {
                System.out.printf("%d ", a[j]);
            }
            System.out.println();
        }
    }
}
