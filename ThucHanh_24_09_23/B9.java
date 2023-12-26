package ThucHanh24_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B9 {
    public static int[][] a = new int[10000][1000];

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            ArrayList<Integer> van = new ArrayList<>();
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                    if (j == k-1)
                        van.add(a[i][j]);
                }
            }
            Collections.sort(van);
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    if (j == k - 1)
                        System.out.print(van.get(i) + " ");
                    else
                        System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
