package J05072;

public class Call implements Comparable<Call> {
    private String phone, city;
    private int minute, money;
    public Call(String p, String c, int mi, int mo) {
        phone = p;
        city = c;
        minute = mi;
        money = mo;
    }
    @Override
    public int compareTo(Call b) {
        return b.money - money;
    }
    @Override
    public String toString() {
        return phone + " " + city + " " + minute + " " + money;
    }
}