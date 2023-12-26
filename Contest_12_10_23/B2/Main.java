package Contest_12_10_23.B2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pair<Integer, Integer>> arr = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                int x = sc.nextInt();
                if (x == 1 && i < j) {
                    arr.add(new Pair<>(i, j));
                }
            }
        }
        for (Pair<Integer, Integer> x : arr) {
            System.out.println("(" + x.getFirst() + "," + x.getSecond() + ")");
        }
    }
}
