package ThucHanh24_9.B6;

public class Bill {
    private String name, id, stt;
    private long dis, sum;
    public Bill(String n, String i, String s, long d, long s1) {
        name = n;
        id = i;
        stt = s;
        dis = d;
        sum = s1;
    }
    @Override
    public String toString() {
        return name + " " + id + " " + stt + " " + dis + " " + sum;
    }
}