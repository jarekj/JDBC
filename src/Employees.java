public class Employees {
    private String fistname;
    private String lastname;
    private int age;

    public Employees(String fistname, String lastname, int age) {
        this.fistname = fistname;
        this.lastname = lastname;
        this.age = age;
    }

    @Override
    public String toString() {
        return fistname + ", " + lastname + ", "+ age;
    }
}
