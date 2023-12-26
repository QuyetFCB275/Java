package ThucHanh24_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class B2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i=0; i<n; i++)
                a[i] = sc.nextInt();

            long sum1=0, sum2=0;
            Arrays.sort(a);
            for (int i=0; i<n; i++) {
                if (i % 2 == 0)
                    sum1 = sum1*10 + a[i];
                else
                    sum2 = sum2*10 + a[i];
            }
            System.out.println(sum1+sum2);
        }
    }
}
