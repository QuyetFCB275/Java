package ThucHanh24_9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class B7 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        long sum=0;
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                int x = Integer.parseInt(s);
            }

            catch (Exception e) {
                try {
                    long x = Long.parseLong(s);
                    sum += x;
                }
                catch (Exception v) {}
            }
        }
        System.out.println(sum);
    }
}
