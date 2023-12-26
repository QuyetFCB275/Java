import java.util.Scanner;

public class J02010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+5];
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        int t = 1;
        for (int i=0; i<n-1; i++) {
            System.out.printf("Buoc %d: ", t);
            for (int j=i+1; j<n; j++) {
                if (a[j] < a[i]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
            for (int k=0; k<n; k++)
                System.out.printf("%d ", a[k]);
            t++;
            System.out.println();
        }
    }
}
