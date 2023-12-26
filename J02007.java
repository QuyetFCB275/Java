import java.util.Scanner;

public class J02007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 1; test <= t; test++) {
            int n = sc.nextInt();
            int[] a = new int[100005];
            int[] b = new int[1005];
            for (int i=0; i<n; i++) {
                b[i] = sc.nextInt();
                a[b[i]] += 1;
            }
            System.out.printf("Test %d:\n", test);
            for (int i=0; i<n; i++) {
                if (a[b[i]] > 0) {
                    System.out.printf("%d xuat hien %d lan\n", b[i], a[b[i]]);
                    a[b[i]] = 0;
                }
            }
        }
    }
}
