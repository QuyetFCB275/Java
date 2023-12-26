package Contest_09_11_23;

import java.util.Scanner;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int[][] a = new int[n][m];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            int b = n - k + 1;
            int c = m - k + 1;
            int[][] res = new int[b][c];
            for (int i=0; i<b; i++) {
                for (int j=0; j<c; j++) {
                    for (int q=0; q<k; q++) {
                        res[i][j] += a[i+q][j+q];
                    }
                    System.out.print(res[i][j] + " ");
                }
            }
            for (int i=0; i<b; i++) {
                for (int j=0; j<c; j++) {
                    System.out.print(res[i][j] / (k*k) + " ");
                }
                System.out.println();
            }
        }
    }
}
