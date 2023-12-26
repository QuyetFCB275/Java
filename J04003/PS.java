package J04003;

class PS {
    private long tu, mau;

    public PS(long tu, long mau) {
        this.tu = tu;
        this.mau = mau;
    }
    public long UCLN(long a, long b) {
        while (b > 0) {
            long k = a;
            a = b;
            b = k % b;
        }
        return a;
    }
    public void rutgon() {
        long k = UCLN(this.tu, this.mau);
        this.tu /= k;
        this.mau /= k;
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }
}