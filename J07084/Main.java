package J07084;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner sc = new Scanner(new File("ONLINE.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> a = new ArrayList<>();
        while (t-- > 0) {
            String name = sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
            LocalDateTime dateTime1 = LocalDateTime.parse(s1, formatter);
            LocalDateTime dateTime2 = LocalDateTime.parse(s2, formatter);

            Duration duration = Duration.between(dateTime1, dateTime2);
            long sum = duration.toMinutes();

            a.add(new Student(name, sum));
        }
        a.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o2.getSum() - o1.getSum());
            }
        });
        for (Student x : a)
            System.out.println(x.getName() + " " + x.getSum());
    }
}
