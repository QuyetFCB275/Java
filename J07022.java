import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J07022 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        ArrayList<String> arr = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try {
                Integer.parseInt(s);
            }
            catch (Exception van) {
                arr.add(s);
            }
        }
        Collections.sort(arr);
        for (String x : arr)
            System.out.print(x + " ");
    }
}
