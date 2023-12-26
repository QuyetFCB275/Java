package J05033;

class Time implements Comparable<Time> {
    int h, m, s;
    public Time(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    @Override
    public String toString () {
        return h + " " + m + " " + s;
    }
    @Override
    public int compareTo(Time second) {
        if (h != second.h)
            return h - second.h;
        if (m != second.m)
            return m - second.m;
        return s - second.s;
    }
}