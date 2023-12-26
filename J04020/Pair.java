package J04020;

import static java.lang.Math.sqrt;

public class Pair <T, S>{
    private T first;
    private S second;

    public Pair (T first, S second) {
        this.first = first;
        this.second = second;
    }

    public boolean isPrime() {
        return check((Integer) first) && check((Integer) second);
    }

    private boolean check(Integer x) {
        if (x < 2)
            return false;
        for (int i=2; i<=sqrt(x); i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return first + " " + second;
    }
}
