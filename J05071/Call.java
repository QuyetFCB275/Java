package J05071;

public class Call {
    private String phone, city;
    private int minute, money;
    public Call(String p, String c, int mi, int mo) {
        phone = p;
        city = c;
        minute = mi;
        money = mo;
    }
    @Override
    public String toString() {
        return phone + " " + city + " " + minute + " " + money;
    }
}
