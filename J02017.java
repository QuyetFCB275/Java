import java.util.Scanner;

public class J02017 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        int[] b = new int[n+5];
        for (int i=1; i<=n; i++)
            a[i] = sc.nextInt();
        int i=1;
        b[1] = a[1];
        for (int j=2; j<=n; j++) {
            if (i == 0) {
                b[++i] = a[j];
            }
            else if ((b[i] + a[j]) % 2 == 0) {
                b[i] = 0;
                i--;
            }
            else {
                i++;
                b[i] = a[j];
            }
        }
        for (int j=1; j<=n+1; j++) {
            if (b[j] == 0) {
                System.out.println(j-1);
                break;
            }
        }
    }
}
