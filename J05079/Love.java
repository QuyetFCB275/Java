package J05079;

/**
 * @author QuyetLD
 * @Package J05079
 * @date 12/18/2023 2:50 PM
 * @Copyright T.may
 */
public class Love implements Comparable<Love>{
    private String id, name, gr, gv;

    public Love(String id, String name, String gr, String gv) {
        this.id = id;
        this.name = name;
        this.gr = gr;
        this.gv = gv;
    }

    public String getId() {
        return id;
    }

    public String getGr() {
        return gr;
    }

    public String getGv() {
        return gv;
    }

    @Override
    public int compareTo(Love b) {
        return gr.compareTo(b.gr);
    }
    @Override
    public String toString() {
        return gr + " " + gv;
    }
}
