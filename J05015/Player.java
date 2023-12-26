package J05015;

public class Player implements Comparable<Player> {
    private String id, name, pos;
    private int vt, hour, minute;
    public Player(String i, String n, String p, int v, int h, int m) {
        id = i;
        name = n;
        pos = p;
        vt = v;
        hour = h;
        minute = m;
    }
    @Override
    public int compareTo(Player b) {
        if (hour == b.hour)
            return minute - b.minute;
        return hour - b.hour;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + pos + " " + vt + " Km/h";
    }
}
