import java.util.Scanner;

public class J02034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[500], k=0;
        for (int i=0; i<n; i++) {
            k = sc.nextInt();
            a[k] = 1;
        }
        if (k == n)
            System.out.printf("Excellent!");
        else {
            for (int i=1; i<=k; i++)
                if (a[i] == 0)
                    System.out.println(i);
        }
    }
}
