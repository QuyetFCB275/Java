package J06004;

class SinhVien implements Comparable<SinhVien>{
    private String id, name, phone;
    private int gr;
    public SinhVien(String id, String name, String phone, int gr) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.gr = gr;
    }

    public int getGr() {
        return gr;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + phone + " " + gr + " ";
    }
    @Override
    public int compareTo(SinhVien b) {
        return id.compareTo(b.id);
    }
}