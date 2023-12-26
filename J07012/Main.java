package J07012;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HashMap<String, Integer> hs = new HashMap<>();
//        Scanner sc = new Scanner(new File("DATA.in"));
//        while (sc.hasNextLine()) {
//            String[] a = sc.nextLine().toLowerCase().trim().split("[ ,.?!:;)(-]");
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> zan = (ArrayList<String>) in.readObject();
        for (String x : zan) {
            String[] a = x.toLowerCase().trim().split("[,.?!:;()-/ ]++");
            for (String b : a) {
                if (b.equals(" ") || b.equals(""))
                    continue;
                if (hs.containsKey(b)) {
                    hs.replace(b, hs.get(b) + 1);
                }
                else
                    hs.put(b, 1);
            }
        }
        ArrayList<word> van = new ArrayList<>();
        for (String x : hs.keySet()) {
            van.add(new word(x, hs.get(x)));
        }
        Collections.sort(van, new Comparator<word>() {
            @Override
            public int compare(word o1, word o2) {
                if (o1.getSum() == o2.getSum())
                    return o1.getName().compareTo(o2.getName());
                return o2.getSum() - o1.getSum();
            }
        });
        for (word x : van)
            System.out.println(x);
    }
}
