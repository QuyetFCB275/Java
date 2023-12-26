package J07036;

/**
 * @author QuyetLD
 * @Package J07036.SINHVIEN
 * @date 11/22/2023 10:16 PM
 * @Copyright T.may
 */
public class Sinhvien {
    private String id, name, love, email;

    public Sinhvien(String id, String name, String love, String email) {
        this.id = id;
        this.name = name;
        this.love = love;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getLove() {
        return love;
    }
}
