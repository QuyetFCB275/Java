package J07010;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SinhVien {
    private String id, name, love;
    private Date date;
    private double gpa;
    public SinhVien(int i, String n, String l, String d, double g) throws ParseException {
        id = "B20DCCN" + String.format("%03d", i);
        name = n;
        love = l;
        date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
        gpa = g;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + love + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", gpa);
    }
}
