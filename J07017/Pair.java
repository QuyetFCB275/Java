package J07017;

public class Pair<typeF, typeS> {
    private typeF x;
    private typeS y;
    public Pair(typeF a, typeS b) {
        this.x = a;
        this.y = b;
    }
    @Override
    public String toString() {
        return x + " " + y;
    }
    public boolean check(int n)
    {
        int sqr = (int) Math.sqrt(n);
        for (int i = 2; i <= sqr; ++i)
            if (n % i == 0)
                return false;
        return true;
    }

    public boolean isPrime()
    {
        return check((Integer) this.x) && check((Integer) this.y);
    }
}
