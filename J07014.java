import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 12/13/2023 9:15 PM
 * @Copyright T.may
 */
public class J07014 {
    public static void main(String[] args) throws IOException {
        WordSet s1 = new WordSet("DATA1.in");
        WordSet s2 = new WordSet("DATA2.in");
        System.out.println(s1.union(s2));
        System.out.println(s1.intersection(s2));
    }
}

class WordSet {
    HashSet<String> hs;
    public WordSet(String file) throws FileNotFoundException {
        hs = new HashSet<>();
        Scanner sc = new Scanner(new File(file));
        while (sc.hasNextLine()) {
            String a[] = sc.nextLine().toLowerCase().split(" ");
            hs.addAll(Arrays.asList(a));
        }
    }

    public String union(WordSet s2) {
        HashSet<String> ans = new HashSet<>(hs);
        ans.addAll(s2.hs);
        ArrayList<String> res = new ArrayList<>(ans);
        Collections.sort(res);
        String s = "";
        for (String x : res)
            s += x + " ";
        return s;
    }

    public String intersection(WordSet s2) {
        HashSet<String> ans = new HashSet<>(hs);
        ans.retainAll(s2.hs);
        ArrayList<String> res = new ArrayList<>(ans);
        Collections.sort(res);
        String s = "";
        for (String x : res)
            s += x + " ";
        return s;
    }
}