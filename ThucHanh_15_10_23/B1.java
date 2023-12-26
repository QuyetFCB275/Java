package ThucHanh_15_10_23;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

import static java.util.Collections.min;

public class B1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        BigInteger sum = sc.nextBigInteger();
        BigInteger minn = sum;
        BigInteger maxx = sum;
        for (int i=1;i<n; i++) {
            BigInteger x = sc.nextBigInteger();
            sum = sum.add(x);
            minn = minn.min(x);
            maxx = maxx.max(x);
        }
        System.out.println(minn);
        System.out.println(maxx);
        System.out.println(sum);
    }
}
