package J07018;

/**
 * @author QuyetLD
 * @Package J07018
 * @date 12/13/2023 11:08 PM
 * @Copyright T.may
 */
public class SinhVien {
    private String id, name, love, date;
    private double gpa;

    public SinhVien(String id, String name, String love, String date, double gpa) {
        this.id = id;
        this.name = name;
        this.love = love;
        this.date = date;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + "" + love + " " + date + " " + String.format("%.2f", gpa);
    }
}
