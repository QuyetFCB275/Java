package J07012;

class word {
    private String name;
    private int sum;
    public word(String n, int s) {
        name = n;
        sum = s;
    }
    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }
    @Override
    public String toString() {
        return name + " " + sum;
    }
}
