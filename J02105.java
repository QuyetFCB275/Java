import java.util.ArrayList;
import java.util.Scanner;

public class J02105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        ArrayList<String> z = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String s = "";
            for (int j=0; j<n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 1)
                    s += (j+1) + " ";
            }
            z.add(s);
        }
        for (int i=1; i<=n; i++) {
            System.out.printf("List(%d) = ", i);
            System.out.println(z.get(i-1));
        }
    }
}
