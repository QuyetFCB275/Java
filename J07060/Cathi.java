package J07060;

/**
 * @author QuyetLD
 * @Package J07060
 * @date 11/22/2023 3:10 PM
 * @Copyright T.may
 */
public class Cathi {
    private String date, hour, id_r;

    public Cathi(String date, String hour, String id_r) {
        this.date = date;
        this.hour = hour;
        this.id_r = id_r;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public String getId_r() {
        return id_r;
    }
}
