import java.util.Scanner;

public class J03032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String[] arr = sc.nextLine().split(" ");
            for (String x : arr) {
                StringBuilder ans = new StringBuilder(x);
                System.out.print(ans.reverse().toString() + " ");
            }
            System.out.println();
        }
    }
}
