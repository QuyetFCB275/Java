package Contest_12_10_23.B8;

public class Pair implements Comparable<Pair>{
    private long x, k;
    public Pair(long x, long k) {
        this.x = x;
        this.k = k;
    }
    @Override
    public int compareTo(Pair b) {
        if (k == b.k)
            return 0;
        return (int) (b.k - k);
    }
    @Override
    public String toString() {
        return x + " " + k;
    }
}
