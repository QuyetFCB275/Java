package J05070;

public class Match implements Comparable<Match>{
    private String id, name;
    private long money;
    public Match(String i, String n, long m) {
        id = i;
        name = n;
        money = m;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + money;
    }
    @Override
    public int compareTo(Match b) {
        if (money == b.money)
            return name.compareTo(b.name);
        return (int) (b.money - money);
    }
}
