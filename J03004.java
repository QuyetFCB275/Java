import java.util.Scanner;

public class J03004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String s = sc.nextLine().toLowerCase();
            String[] a = s.split("\\s+");
            for (String x : a) {
                x = String.valueOf(x.charAt(0)).toUpperCase() +  x.substring(1);
                System.out.printf("%s ", x);
            }
            System.out.println();
        }
    }
}