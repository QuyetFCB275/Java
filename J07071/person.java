package J07071;

class person {
    private String id, fname, lname;
    public person(String i, String f, String l) {
        id = i;
        fname = f;
        lname = l;
    }
    public String getFname() {
        return fname;
    }
    public String getLname() {
        return lname;
    }
    public String getId() {
        return id;
    }
}