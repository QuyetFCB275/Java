package J05003;

class SinhVien {
    String id, name, love, date;
    double gpa;

    public SinhVien(String name, String love, String date, double gpa) {
        this.id = "B20DCCN0";
        this.name = name;
        this.love = love;
        this.date = date;
        this.gpa = gpa;
    }
    public void solve() {
        if (date.charAt(1) == '/')
            date = 0 + date;
        if (date.charAt(4) == '/')
            date = date.substring(0, 3) + 0 + date.substring(3);
    }
    @Override
    public String toString() {
        return id + " " + name + " " + love + " " + date + " ";
    }
}