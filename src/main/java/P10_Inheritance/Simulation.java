package P10_Inheritance;

public class Simulation {
    SupervisionRelationship supervisionRelationship;

    public Simulation() {
        Lecturer lecturer = new Lecturer("Albert Einstein", "1234-5678", "TG210", "058-9347259");
        supervisionRelationship = new SupervisionRelationship(lecturer);
    }

    private void simulate() {
        supervisionRelationship.addStudent(new Student("Adam Alder", "abcd-efgh"));
        supervisionRelationship.addStudent(new Student("Bea Bingo", "acte-gikm"));
        supervisionRelationship.addStudent(new Student("Clea Clever", "bdfh-jlnp"));
        supervisionRelationship.addStudent(new Student("Dino Dasen", "qwer-tzui"));
        supervisionRelationship.addStudent(new Student("Eva Ente", "asdf-ghjk"));
        supervisionRelationship.addStudent(new Student("Fritz Floh", "yxcv-bnmm"));
        supervisionRelationship.addStudent(new Student("Geri Gugger", "uvwa-xyzb"));
        supervisionRelationship.distributeCredits();
        supervisionRelationship.display();
    }

    public static void main(String[] args) {
        (new Simulation()).simulate();
    }
}
