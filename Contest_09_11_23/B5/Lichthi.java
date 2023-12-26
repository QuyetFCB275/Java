package Contest_09_11_23.B5;

public class Lichthi implements Comparable<Lichthi>{
    private String date, time, idr, name, gr, sum;
    private String day;
    private String id_ca;
    public Lichthi(String id_ca, String d, String t, String idr, String n, String g, String s) {
        this.id_ca = id_ca;
        date = d;
        time = t;
        this.idr = idr;
        name = n;
        gr = g;
        sum = s;
        day = d.substring(6) + d.substring(3, 5) + d.substring(0, 2);
    }
    @Override
    public String toString() {
        return date + " " + time + " " + idr + " " + name + " " + gr + " " + sum;
    }
    @Override
    public int compareTo(Lichthi b) {
        if (day.compareTo(b.day) == 0) {
            if (time.compareTo(b.time) == 0)
                return id_ca.compareTo(b.id_ca);
            return time.compareTo(b.time);
        }
        return day.compareTo(b.day);
    }
}
