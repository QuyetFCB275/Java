import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 11/22/2023 10:53 PM
 * @Copyright T.may
 */
public class J07078 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("STRING.in"));
        int t = sc.nextInt();
        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();
            int k = 0;
            while (a.indexOf(b, k) > -1) {
                System.out.print(a.indexOf(b, k) + 1 + " ");
                k = a.indexOf(b, k) + 1;
            }
            System.out.println();
        }
    }
}
