package Contest_09_11_23.B5;

public class Cathi {
    private String id, date, time, idr;
    public Cathi(String i, String d, String t, String idr) {
        id = i;
        date = d;
        time = t;
        this.idr = idr;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getIdr() {
        return idr;
    }
}
