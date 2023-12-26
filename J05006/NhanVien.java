package J05006;

class NhanVien {
    String id, name, sex, date, add, thue, day;
    public NhanVien(String name, String sex, String date, String add, String thue, String day) {
        this.id = "000";
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.thue = thue;
        this.day = day;
        this.add = add;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + sex + " " + date + " " + add + " " + thue + " " + day;
    }
}