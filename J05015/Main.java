package J05015;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Player> a = new ArrayList<>();

        int n = sc.nextInt();
        sc.nextLine();
        while (n-- > 0) {
            String name = sc.nextLine();
            String pos = sc.nextLine();

            String time = sc.nextLine();
            double tim;
            int h, m;
            if (time.charAt(1) == ':') {
                h = time.charAt(0) - '6';
                m = Integer.parseInt(time.substring(2));
                tim = (double) h + (double) m / 60;
            }

            else {
                h = Integer.parseInt(time.substring(0, 2)) - 6;
                m = Integer.parseInt(time.substring(2));
                tim = (double) h + (double) m / 60;
            }

            int ti = (int) (Math.round(120 / tim));

            String id = "";
            for (String x : pos.split(" "))
                id += x.charAt(0);
            for (String x : name.split(" "))
                id += x.charAt(0);
            a.add(new Player(id, name, pos, ti, h, m));
        }
        Collections.sort(a);
        for (Player x : a) {
            System.out.println(x);
        }
    }
}
