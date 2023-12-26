import java.util.Scanner;

public class J02013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        for (int i=0; i<n; i++)
            a[i] = sc.nextInt();
        for (int j=1; j<n; j++) {
            System.out.printf("Buoc %d: ", j);
            for (int i=0; i<n-1; i++) {
                if (a[i] > a[i+1]) {
                    int tmp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = tmp;
                }
            }
            boolean ck = true;
            for (int i=0; i<n-1; i++) {
                System.out.printf("%d ", a[i]);
                if (a[i] > a[i+1])
                    ck = false;
            }
            System.out.printf("%d\n", a[n-1]);
            if (ck)
                break;
        }
    }
}
