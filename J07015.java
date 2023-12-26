import static java.lang.Math.*;
import java.io.*;
import java.util.ArrayList;

public class J07015 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream sc = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> arr = (ArrayList<Integer>) sc.readObject();
        int f[] = new int[10005];
        for (Integer x : arr) {
            if (isPrime(x))
                f[x]++;
        }
        for (int i=0; i<10005; i++) {
            if (f[i] > 0)
                System.out.println(i + " " + f[i]);
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
