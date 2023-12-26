package ThucHanh24_9.B5;

public class Men {
    private String id, name, team, school;

    public Men(String i, String n, String t, String s) {
        id = i;
        name = n;
        team = t;
        school = s;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + team + " " + school;
    }
}
