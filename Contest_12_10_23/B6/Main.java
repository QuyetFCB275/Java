package Contest_12_10_23.B6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        HashMap<String, Integer> hs = new HashMap<>();
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNextLine()) {
            String[] arr = sc.nextLine().toLowerCase().trim().split("\\s++");
            String x = "";
            String name = arr[arr.length-1];
            for (int i=0; i< arr.length; i++) {
                x += arr[i];
                if (i != arr.length-1)
                    name += arr[i].charAt(0);
            }
//            System.out.println(x);
//            System.out.println(name);
            if (!a.contains(x)) {
                a.add(x);
                String ans = "";
                if (hs.containsKey(name)) {
                    ans = name + (hs.get(name) + 1) + "@ptit.edu.vn";
                    hs.replace(name, hs.get(name) + 1);
                }
                else {
                    ans = name + "@ptit.edu.vn";
                    hs.put(name, 1);
                }
                System.out.println(ans);
            }
        }
    }
}
