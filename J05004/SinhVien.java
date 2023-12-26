package J05004;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class SinhVien {
    private String id, name, love;
    private Date date;
    private double gpa;
    public SinhVien(int id, String n, String l, String d, double g) throws ParseException {
        this.id = "B20DCCN0" + String.format("%02d", id);
        name = n;
        date = new SimpleDateFormat("dd/MM/yyyy").parse(d);
        love = l;
        gpa = g;
    }
    public void solve() {
        name = name.toLowerCase();
        name = name.trim();
        String[] a = name.split("\\s+");
        name = "";
        for (String x : a) {
            x = String.valueOf(x.charAt(0)).toUpperCase() + String.valueOf(x.substring(1)).toLowerCase();
            name += x + " ";
        }
    }

    @Override
    public String toString() {
        return id + " " + name + love + " " + new SimpleDateFormat("dd/MM/yyyy").format(date) + " " + String.format("%.2f", gpa);
    }
}