package J07036;

/**
 * @author QuyetLD
 * @Package J07036
 * @date 11/22/2023 10:19 PM
 * @Copyright T.may
 */
public class Bangdiem implements Comparable<Bangdiem> {
    private String id_n, name, id, sub, score, love;

    public Bangdiem(String id_n, String name, String id, String sub, String score, String love) {
        this.id_n = id_n;
        this.name = name;
        this.id = id;
        this.sub = sub;
        this.score = score;
        this.love = love;
    }

    public String getLove() {
        return love;
    }

    @Override
    public int compareTo(Bangdiem b) {
        if (id.equals(b.id))
            return id_n.compareTo(b.id_n);
        return id.compareTo(b.id);
    }

    @Override
    public String toString() {
        return id_n + " " + name + " " + id + " " + sub + " " + score;
    }
}
