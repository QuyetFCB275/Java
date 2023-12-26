import static java.lang.Math.*;
import java.io.*;
import java.util.ArrayList;

public class J07029 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("VANBAN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int f[] = new int[1000005];
        for (Integer x : arr) {
            if (isPrime(x))
                f[x]++;
        }
        int dem=0;
        for (int i=1000000; i>=2; i--) {
            if (f[i] > 0) {
                System.out.println(i + " " + f[i]);
                dem++;
            }
            if (dem == 10)
                break;
        }
    }

    private static boolean isPrime(Integer x) {
        if (x < 2)
            return false;
        for (int i=2; i<=sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
