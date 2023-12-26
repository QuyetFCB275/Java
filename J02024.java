import java.util.*;

public class J02024 {
    public static Integer[] a;
    public static int n;
    public static ArrayList<String> arr = new ArrayList<>();

    public static void Try(int i, int sum, String s) {
        for (int j=i; j<n; j++) {
            sum += a[j];
            if (sum % 2 == 1)
//                System.out.println(s + Integer.valueOf(a[j]));
                arr.add(s + Integer.valueOf(a[j]));
            Try(j+1, sum, s + Integer.valueOf(a[j]) + " ");
            sum -= a[j];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            a = new Integer[n];
            for (int i=0;i<n; i++)
                a[i] = sc.nextInt();
            Arrays.sort(a, Comparator.reverseOrder());
            Try(0, 0, "");
            arr.sort(Comparator.naturalOrder());
            for (String x : arr)
                System.out.println(x);
        }
    }
}
