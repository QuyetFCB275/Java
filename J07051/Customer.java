package J07051;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Customer {
    private String id, name = "", room;
    private long day, sum_money;
    public Customer(int i, String n, String r, String d1, String d2, long cost1, long cost2) throws ParseException {
        id = String.format("KH" + "%02d", i);
        ArrayList<String> a = new ArrayList<>(Arrays.asList(n.toLowerCase().split("\\s++")));
        for (String x : a) {
            name += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }

        room = r;

        Date df1 = new SimpleDateFormat("dd/MM/yyyy").parse(d1);
        Date df2 = new SimpleDateFormat("dd/MM/yyyy").parse(d2);
        String s1 = new SimpleDateFormat("dd/MM/yyyy").format(df1);
        String s2 = new SimpleDateFormat("dd/MM/yyyy").format(df2);
        LocalDate date1 = LocalDate.of(Integer.parseInt(s1.substring(6)), Integer.parseInt(s1.substring(3, 5)), Integer.parseInt(s1.substring(0, 2)));
        LocalDate date2 = LocalDate.of(Integer.parseInt(s2.substring(6)), Integer.parseInt(s2.substring(3, 5)), Integer.parseInt(s2.substring(0, 2)));
        day = date1.until(date2, ChronoUnit.DAYS) + 1;
        sum_money = day*cost1 + cost2;
    }

    public long getSum_money() {
        return sum_money;
    }

    @Override
    public String toString() {
        return id + " " + name + "" + room + " " + day + " " + sum_money;
    }
}
