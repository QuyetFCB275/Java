package Contest_12_10_23.B5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        for (int i=0; i<m; i++)
            b[i] = sc.nextInt();
        IntSet v1 = new IntSet(a);
        IntSet v2 = new IntSet(b);
        IntSet ans1 = v1.intersection(v2);
        IntSet ans2 = v1.different(v2);
        IntSet ans3 = v2.different(v1);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
