import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author QuyetLD
 * @Package PACKAGE_NAME
 * @date 12/17/2023 9:09 PM
 * @Copyright T.may
 */
public class J05032 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        ArrayList<Person> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            String[] a = sc.nextLine().split(" ");
            String name = a[0];
            String date = a[1];
            arr.add(new Person(name, date));
        }
        Collections.sort(arr);
        System.out.println(arr.get(arr.size() - 1).getName());
        System.out.println(arr.get(0).getName());
    }
}

class Person implements Comparable<Person>{
    private String name, date, day;

    public Person(String name, String date) {
        this.name = name;
        this.day = date;
        this.date = date.substring(6) + date.substring(3, 5) + date.substring(0, 2);
    }
    @Override
    public int compareTo(Person b) {
        return date.compareTo(b.date);
    }
    @Override
    public String toString() {
        return name + " " + day;
    }

    public String getName() {
        return name;
    }
}