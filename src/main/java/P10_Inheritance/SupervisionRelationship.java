package P10_Inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * This class manages the {@link Student}s supervised by the {@link Lecturer}.
 *
 * @author Marc Rennhard
 */
public class SupervisionRelationship {
    private final Lecturer lecturer;
    private final List<Student> students = new ArrayList<>();
    private final Random random = new Random();

    /**
     * Creates a supervision relationship.
     *
     * @param lecturer The lecturer
     */
    public SupervisionRelationship(Lecturer lecturer) {
        this.lecturer = lecturer;
    }

    /**
     * Adds a student to the supervision relationship.
     *
     * @param student The student
     */
    public void addStudent(Student student) {
        students.add(student);
    }

    /**
     * Distributes a certain number of credits randomly among the students.
     */
    public void distributeCredits() {
        int creditsRounds = 10 * students.size();
        while (creditsRounds > 0) {
            students.get(random.nextInt(students.size())).increaseCredits(4);
            creditsRounds--;
        }
    }

    /**
     * Prints the information of this supervision relationship.
     */
    public void display() {
        String format = "%-10s %s%n";
        System.out.printf(format, "Lecturer:", lecturer.getInfo());
        System.out.printf(format, "Office:", lecturer.getOffice());
        System.out.printf(format, "Phone:", lecturer.getPhoneNumber());
        System.out.printf("%d supervised Students:%n", students.size());
        for (Student student : students) {
            System.out.printf(" %25s, %3d credits%n", student.getInfo(), student.getCredits());
        }
    }
}
