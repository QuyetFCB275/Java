import java.util.Scanner;

public class J01008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i=1; i<=t; i++){
            long n = sc.nextLong();
            System.out.printf("Test %d: ", i);
            int k = 2;
            while (k < n) {
                if (n % k == 0) {
                    int dem = 0;
                    while (n % k == 0) {
                        dem++;
                        n /= k;
                    }
                    System.out.printf("%d(%d) ", k, dem);
                }
                k++;
            }
            if (n > 1)
                System.out.printf("%d(1) ", n);
            System.out.println();
        }
    }
}
