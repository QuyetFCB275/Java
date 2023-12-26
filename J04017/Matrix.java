package J04017;

import java.util.Scanner;

class Matrix {
    int[][] a = new int[100][100];
    int n, m;
    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
    }
    public void nextMatrix(Scanner sc) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++)
                a[i][j] = sc.nextInt();
        }
    }
    public Matrix trans() {
        Matrix b = new Matrix(this.m, this.n);
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                b.a[i][j] = this.a[j][i];
            }
        }
        return b;
    }
    public String mul(Matrix b) {
        int n = this.n, m = this.m, p = b.m;
        int[][] res = new int[n][p];
        for (int i=0; i<n; i++) {
            for (int j=0; j<p; j++) {
                res[i][j] = 0;
                for (int k=0; k<m; k++)
                    res[i][j] += a[i][k] * b.a[k][j];
            }
        }
        String ans = "";
        for (int i=0; i<n; i++) {
            for (int j=0; j<p; j++)  {
                ans += res[i][j] + " ";
            }
            ans += "\n";
        }
        return ans;
    }
}