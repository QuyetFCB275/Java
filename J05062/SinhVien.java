package J05062;

public class SinhVien implements Comparable<SinhVien>{
    private String name, stt;
    double gpa, d;

    public SinhVien(String n, double g, double d) {
        name = n;
        gpa = g;
        this.d = d;
    }

    public double getGpa() {
        return gpa;
    }

    public double getD() {
        return d;
    }

    public String getName() {
        return name;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }
    @Override
    public int compareTo(SinhVien b) {
        if (gpa >= b.gpa)
            return -1;
        return 1;
    }
    @Override
    public String toString() {
        return name + ": " + stt;
    }
}
