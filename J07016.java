import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import static java.lang.Math.sqrt;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 12/13/2023 10:47 PM
 * @Copyright T.may
 */
public class J07016 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> arr1 = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> arr2 = (ArrayList<Integer>) in2.readObject();

        int a[] = new int[10005];
        int b[] = new int[10005];
        for (Integer x : arr1) {
            a[x]++;
        }
        for (Integer x : arr2) {
            b[x]++;
        }
        for (int i=2; i<=10000; i++) {
            if (isPrime(i) && a[i] > 0 && b[i] > 0) {
                System.out.println(i + " " + a[i] + " " + b[i]);
            }
        }
    }

    public static boolean isPrime(int x){
        if (x < 2)
            return false;
        for (int i=2; i<=sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
