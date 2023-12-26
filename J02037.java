import java.util.Scanner;

public class J02037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            int c=0, l=0, n;
            String[] a = sc.nextLine().split("\\s+");
            n = a.length;
            for (int i=0; i<n; i++) {
                if (a[i].charAt(a[i].length() - 1) % 2 == 0)
                    c++;
                else l++;
            }
            if (n % 2 == 0 && c > l || n % 2 == 1 && c < l)
                System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
