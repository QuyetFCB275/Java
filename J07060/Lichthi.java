package J07060;

/**
 * @author QuyetLD
 * @Package J07060
 * @date 11/22/2023 3:10 PM
 * @Copyright T.may
 */
public class Lichthi implements Comparable<Lichthi>{
    private String day, hour, id_r, name, id_g, count;
    private String day_ss;

    public Lichthi(String day, String hour, String id_r, String name, String id_g, String count) {
        this.day = day;
        this.hour = hour;
        this.id_r = id_r;
        this.name = name;
        this.id_g = id_g;
        this.count = count;
        this.day_ss = day.substring(6) + day.substring(3, 5) + day.substring(0, 2);
    }
    @Override
    public int compareTo(Lichthi b) {
        if (day_ss.equals(b.day_ss))
            return hour.compareTo(b.hour);
        return day_ss.compareTo(b.day_ss);
    }
    @Override
    public String toString() {
        return day + " " + hour + " " + id_r + " " + name + " " + id_g + " " + count;
    }
}
