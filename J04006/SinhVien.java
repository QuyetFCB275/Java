package J04006;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class SinhVien {
    private String id, name, love;
    private Date date;
    private double gpa;
    public SinhVien(String name, String love, String date, double gpa) throws ParseException {
        this.id = "B20DCCN001";
        this.name = name;
        this.love = love;
        this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + love + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", gpa);
    }
}