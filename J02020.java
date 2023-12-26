import java.util.Scanner;

public class J02020 {
    public static int[] a = new int[20];
    public static int n, k, sum;

    public static void in() {
        sum++;
        for (int i=1; i<=k; i++)
            System.out.printf("%d ", a[i]);
        System.out.printf("\n");
    }
    public static void Try(int i) {
        for (int j = a[i-1] + 1; j <= n- k + i; j++) {
            a[i] = j;
            if (i == k)
                in();
            else
                Try(i+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        Try(1);
        System.out.printf("Tong cong co %d to hop", sum);
    }
}
