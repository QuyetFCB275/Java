package J07084;

import java.util.Comparator;

/**
 * @author QuyetLD
 * @Package J07084
 * @date 11/22/2023 11:19 PM
 * @Copyright T.may
 */
public class Student {
    private String name;
    private long sum;

    public Student(String name, long sum) {
        this.name = name;
        this.sum = sum;
    }

    public long getSum() {
        return sum;
    }

    public String getName() {
        return name;
    }
}
