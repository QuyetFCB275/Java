package J04004;

class Ps {
    private long tu, mau;

    public Ps(long tu, long mau) {
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
    public void in() {
        System.out.printf("%d/%d", tu, mau);
    }
    public void add(Ps b) {
        long k = this.mau * b.mau / (UCLN(this.mau, b.mau));
        this.tu = this.tu * (k / this.mau) + b.tu * (k / b.mau);
        this.mau = k;
    }
}