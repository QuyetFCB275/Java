package J06008;

import java.util.ArrayList;

public class GV {
    private String name;
    private float sum;
    private ArrayList<String> arr;
    public GV(String n, float s) {
        name = n;
        sum = s;
        arr = new ArrayList<>();
    }
    public void update(String sub, float k) {
        arr.add(sub + " " + k);
        sum += k;
    }

    public void String() {
        System.out.println("Giang vien: " + name);
        for (String x : arr)
            System.out.println(x);
        System.out.println("Tong: " + String.format("%.2f", sum));
    }
}
