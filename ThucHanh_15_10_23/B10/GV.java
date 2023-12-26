package ThucHanh_15_10_23.B10;

public class GV {
    private String id, name;
    private float sum=0;
    public GV(String i, String n) {
        id = i;
        name = n;
    }

    public String getId() {
        return id;
    }

    public void update(float k) {
        sum += k;
    }

    @Override
    public String toString() {
        return name + " " + String.format("%.2f", sum);
    }
}
