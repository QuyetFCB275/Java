package J07027;

public class SinhVien implements Comparable<SinhVien> {
    private String id, name, phone, subject;
    private int gr;
    public SinhVien (String i, String n, String p) {
        id = i;
        name = n;
        phone = p;
    }

    public void setGr(int gr) {
        this.gr = gr;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int compareTo(SinhVien b) {
        return id.compareTo(b.id);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + gr + " " + subject;
    }
}
