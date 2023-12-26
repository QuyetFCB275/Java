package ThucHanh24_9;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class B4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        TreeSet<String> se1 = new TreeSet<>();
        for (int i=0; i<n; i++) {
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s++");
            se1.addAll(Arrays.asList(arr));
        }

        int m = sc.nextInt();
        sc.nextLine();
        TreeSet<String> se2 = new TreeSet<>();
        for (int i=0; i<m; i++) {
            String[] arr = sc.nextLine().trim().toLowerCase().split("\\s++");
            se2.addAll(Arrays.asList(arr));
        }

        for (String x : se1) {
            if (!se2.contains(x))
                System.out.print(x + " ");
        }
        System.out.println();

        for (String x : se2) {
            if (!se1.contains(x))
                System.out.print(x + " ");
        }
    }
}
