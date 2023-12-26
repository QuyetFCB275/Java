import java.util.Scanner;

public class J03022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        while(sc.hasNextLine()) {
            s += sc.nextLine() + " ";
        }
        String[] a = s.split("[.?!]+");
        for (String x : a) {
            if (x.length() > 0) {
                String ans = "";
                String[] arr = x.trim().toLowerCase().split("\\s++");
                if (arr[0].length() == 0)
                    continue;
                ans += arr[0].substring(0, 1).toUpperCase() + arr[0].substring(1) + " ";
                for (int i=1; i<arr.length; i++) {
                    ans += arr[i] + " ";
                }
                System.out.println(ans);
            }
        }
    }
}
