package ThucHanh24_9.B13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> van = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            String name = sc.nextLine();
            String k = sc.nextLine();
            if (hs.contains(id)) {}
            else {
                hs.add(id);
                van.add(new Subject(id, name, k));
            }
        }
        Collections.sort(van, new Comparator<Subject>() {
            @Override
            public int compare(Subject o1, Subject o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Subject x : van)
            System.out.println(x);
    }
}
