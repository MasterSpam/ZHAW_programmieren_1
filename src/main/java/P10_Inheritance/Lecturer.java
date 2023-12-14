package P10_Inheritance;

public class Lecturer extends Person{

    private String office;
    private String phoneNumber;

    public Lecturer(String name, String ID, String office, String phoneNumber) {
        super(name, ID);
        this.office = office;
        this.phoneNumber = phoneNumber;
    }

    public String getOffice() {
        return office;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
