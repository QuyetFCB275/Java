package J06007;

public class GV {
    private String name;
    private float sum;
    public GV(String n, float s) {
        name = n;
        sum = s;
    }
    public void update(float k) {
        sum += k;
    }
    @Override
    public String toString() {
        return name + " " + String.format("%.02f", sum);
    }
}
