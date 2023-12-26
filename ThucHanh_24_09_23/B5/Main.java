package ThucHanh24_9.B5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        HashMap<String, Team> hs = new HashMap<>();
        for (int i=1; i<=t; i++) {
            String id = "Team" + String.format("%02d", i);
            String name = sc.nextLine();
            String school = sc.nextLine();
            Team a = new Team(id, name, school);
            hs.put(id, a);
        }

        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Men> van = new ArrayList<>();
        for (int i=1; i<=n; i++) {
            String id = "C" + String.format("%03d", i);
            String name = sc.nextLine();
            String team = sc.nextLine();
            Team v = hs.get(team);
            van.add(new Men(id, name, v.getName(), v.getSchool()));
        }
        Collections.sort(van, new Comparator<Men>() {
            @Override
            public int compare(Men o1, Men o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Men x : van)
            System.out.println(x);
    }
}
