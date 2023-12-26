import java.util.Scanner;

public class J02103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int v = 1; v <= t; v++) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] a = new int[n][m];
            int[][] b = new int[m][n];
            for (int i=0; i<n; i++) {
                for (int j=0; j<m; j++) {
                    a[i][j] = sc.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            int[][] ans = new int [n][n];
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    ans[i][j] = 0;
                    for (int k=0; k<m; k++) {
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.printf("Test %d:\n", v);
            for (int i=0; i<n; i++) {
                for (int j=0; j<n; j++) {
                    System.out.printf("%d ", ans[i][j]);
                }
                System.out.println();
            }
        }
    }
}
