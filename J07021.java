import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07021 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        String s = sc.nextLine();
        while (!s.equals("END")) {
            String[] a = s.trim().toUpperCase().split("\\s+");
            String ans="";
            for (String x : a) {
                ans += x.charAt(0) + x.substring(1).toLowerCase() + " ";
            }
            System.out.println(ans);
            s = sc.nextLine();
        }
    }
}
