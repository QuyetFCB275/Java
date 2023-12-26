package J05069;

public class Club {
    private String id, name;
    private long cost;
    public Club (String i, String n, long c) {
        id = i;
        name = n;
        cost = c;
    }

    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public long getCost() {
        return cost;
    }
}
