package J07037;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DN.in"));
        ArrayList<Company> a = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<n; i++) {
            a.add(new Company(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(a, new Comparator<Company>() {
            @Override
            public int compare(Company o1, Company o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Company x : a)
            System.out.println(x);
    }
}
