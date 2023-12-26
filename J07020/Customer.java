package J07020;

/**
 * @author QuyetLD
 * @Package J07020
 * @date 12/13/2023 10:29 PM
 * @Copyright T.may
 */
public class Customer {
    private String id, name, sex, date, add;

    public Customer(String id, String name, String sex, String date, String add) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.date = date;
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public String getAdd() {
        return add;
    }
}
