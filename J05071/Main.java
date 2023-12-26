package J05071;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<Integer, Integer> v1 = new HashMap<>();
        HashMap<Integer, String> v2 = new HashMap<>();
        for (int i=0; i<n; i++) {
            int id = in.nextInt();
            in.nextLine();
            String city = in.nextLine();
            int cost = in.nextInt();
            v1.put(id, cost);
            v2.put(id, city);
        }

        ArrayList<Call> a = new ArrayList<>();
        int q = in.nextInt();
        for (int i=0; i<q; i++) {
            String phone = in.next(), s2 = in.next(), s3 = in.next();
            int cost, minute;
            String city;
            minute = (Integer.parseInt(s3.substring(0, 2)) - Integer.parseInt(s2.substring(0, 2))) * 60 + Integer.parseInt(s3.substring(3)) - Integer.parseInt(s2.substring(3));
            if (phone.charAt(0) == '0') {
                int id = Integer.parseInt(phone.substring(1, 3));
                cost = v1.get(id);
                city = v2.get(id);
            }
            else {
                minute = (int) (Math.ceil((double) minute/3));
                cost = 800;
                city = "Noi mang";
            }
            a.add(new Call(phone, city, minute, minute*cost));
        }
        for (Call x : a)
            System.out.println(x);
    }
}
