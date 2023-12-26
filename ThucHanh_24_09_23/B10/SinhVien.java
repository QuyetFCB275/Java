package ThucHanh24_9.B10;

public class SinhVien implements Comparable<SinhVien>{
    private String name;
    private int correct, sum;
    public SinhVien(String n, int c, int s) {
        name = n;
        correct = c;
        sum = s;
    }
    @Override
    public int compareTo(SinhVien b) {
        if (correct != b.correct)
            return b.correct - correct;
        if (sum != b.sum)
            return sum - b.sum;
        return name.compareTo(b.name);
    }
    @Override
    public String toString() {
        return name + " " + correct + " " + sum;
    }
}
