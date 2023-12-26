package ThucHanh24_9.B5;

public class Team {
    private String id, name, school;
    public Team(String i, String n, String s) {
        id = i;
        name = n;
        school = s;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }
}
