package P10_Inheritance;

public class Person {

    private String name;
    private String ID;

    public Person(String name, String ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getInfo() {
        return name + ", ID " + ID;
    }
}
