package J05007;

class NhanVien implements Comparable<NhanVien> {
    String id, name, sex, date, add, thue, day, ans;
    public NhanVien(String name, String sex, String date, String add, String thue, String day) {
        this.id = "000";
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.thue = thue;
        this.day = day;
        this.add = add;
        this.ans = this.date.substring(6) + this.date.substring(3, 5) + this.date.substring(0, 2);
    }

    public String toString() {
        return id + " " + name + " " + sex + " " + date + " " + add + " " + thue + " " + day;
    }

    public int compareTo(NhanVien b) {
        return this.ans.compareTo(b.ans);
    }
}