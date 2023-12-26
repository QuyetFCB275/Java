import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J07004 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int f[] = new int[1005], x;
        while (sc.hasNextInt()) {
            x = sc.nextInt();
            f[x]++;
        }
        for (int i=0;i<=1000; i++) {
            if (f[i] > 0) {
                System.out.printf(i + " " + f[i] + "\n");
            }
        }
    }
}
