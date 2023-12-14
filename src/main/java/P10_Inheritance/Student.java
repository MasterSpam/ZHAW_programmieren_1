package P10_Inheritance;

public class Student extends Person{
    private int credits;

    public Student(String name, String ID) {
        super(name, ID);
        this.credits = 0;
    }

    public void increaseCredits(int credits) {
        this.credits += credits;
    }

    public int getCredits() {
        return credits;
    }
}
