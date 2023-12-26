import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07008 {
    public static int n;
    public static int[] a = new int[100];
    public static ArrayList<String> van = new ArrayList<>();
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Try(0, "", 0);
        Collections.sort(van);
        for (String s : van)
            System.out.println(s);
    }

    private static void Try(int pre, String s, int idx) {
        for (int j=idx; j<n; j++) {
            if (a[j] > pre){
                if (s.length() > 0)
                    van.add(s + a[j] + " ");
                Try(a[j], s + a[j] + " ", j+1);
            }
        }
    }

}
