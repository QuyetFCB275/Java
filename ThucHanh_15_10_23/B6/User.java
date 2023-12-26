package ThucHanh_15_10_23.B6;

public class User {
    private String use, pass;
    public User(String u, String p) {
        use = u;
        pass = p;
    }
    @Override
    public String toString () {
        return use + " " + pass;
    }
}
