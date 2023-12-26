package J07035;

/**
 * @author QuyetLD
 * @Package J07035
 * @date 12/18/2023 3:09 PM
 * @Copyright T.may
 */
public class Bangdiem implements Comparable<Bangdiem>{
    private Student sv;
    private Monhoc mon;
    private String diem;

    public Bangdiem(Student sv, Monhoc mon, String diem) {
        this.sv = sv;
        this.mon = mon;
        this.diem = diem;
    }
    @Override
    public int compareTo(Bangdiem b) {
        float d1 = Float.parseFloat(diem);
        float d2 = Float.parseFloat(b.diem);
        if (d1 == d2)
            return sv.getId().compareTo(b.sv.getId());
        return d2 > d1 ? 1 : -1;
    }
    @Override
    public String toString() {
        return sv.getId() + " " + sv.getName() + "" + sv.getLove() + " " + diem;
    }
    public String getId() {
        return mon.getId();
    }
}
