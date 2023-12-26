package J07051;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        HashMap<Integer, Integer> hs = new HashMap<>();
        hs.put(1, 25);
        hs.put(2, 34);
        hs.put(3, 50);
        hs.put(4, 80);

        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Customer> van = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            sc.nextLine();
            String name = sc.nextLine().trim();
            String room = sc.nextLine().trim();
            String day1 = sc.nextLine().trim();
            String day2 = sc.nextLine().trim();
            long phatsinh = sc.nextLong();
            long cost = hs.get(room.charAt(0) - '0');
            van.add(new Customer(i, name, room, day1, day2, cost, phatsinh));
        }
        Collections.sort(van, new Comparator<Customer>() {
            @Override
            public int compare(Customer o1, Customer o2) {
                return (int) (o2.getSum_money() - o1.getSum_money());
            }
        });
        for (Customer x : van)
            System.out.println(x);
    }
}
