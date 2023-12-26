import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class J07040 {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> a = (ArrayList<String>) in.readObject();
        HashSet<String> hs = new HashSet<>();
        for (String x : a) {
            ArrayList<String> zan = new ArrayList<>(Arrays.asList(x.toLowerCase().split("\\s++")));
            hs.addAll(zan);
        }
        ArrayList<String> ans = new ArrayList<>();
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().toLowerCase().split("\\s++");
            for (String x : arr) {
                if (hs.contains(x) && !ans.contains(x)) {
                    ans.add(x);
                }
            }
        }
        for (String x : ans)
            System.out.println(x);
    }
}
