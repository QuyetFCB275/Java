package J07035;

/**
 * @author QuyetLD
 * @Package J07035
 * @date 12/18/2023 3:09 PM
 * @Copyright T.may
 */
public class Student {
    private String id, name = "", love, mail;

    public Student(String id, String name, String love, String mail) {
        this.id = id;
        String[] a = name.toLowerCase().split(" ");
        for (String x : a) {
            if (x.length() == 0)
                continue;
            this.name += x.substring(0, 1).toUpperCase() + x.substring(1) + " ";
        }
        this.love = love;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getLove() {
        return love;
    }

    public String getId() {
        return id;
    }
}
