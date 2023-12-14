class Haustier {
    public void bellen() {
        System.out.println("Das Haustier bellt");
    }
}

class Hund extends Haustier {
    public void bellen() {
        System.out.println("Der Hund bellt");
    }
}

class Dogge extends Hund {
    // Die Dogge erbt die bellen-Methode von Hund
    public void bellen() {
        System.out.println("Die Dogge bellt");
    }
}

public class Testing {
    public static void main(String[] args) {


        Haustier tier = new Dogge();
        tier.bellen();

    }
}
