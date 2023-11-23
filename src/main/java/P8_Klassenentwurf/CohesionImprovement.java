package P8_Klassenentwurf;

public class CohesionImprovement {

    /*     old bad code:
            private int zahl = 1;
            public int manipuliereZahl(int befehl, int zahl) {
                if (befehl == 0) {
                    this.zahl = zahl;
                }
                if (befehl == 1) {
                    this.zahl = this.zahl + zahl;
                }
                if (befehl == 2) {
                    this.zahl = this.zahl - zahl;
                }
                return this.zahl;
            }*/
    private int zahl = 1;

    public int setZahl(int zahl) {
        this.zahl = zahl;
        return this.zahl;
    }

    public int addZahl(int zahl) {
        this.zahl = this.zahl + zahl;
        return this.zahl;
    }

    public int subZahl(int zahl) {
        this.zahl = this.zahl - zahl;
        return this.zahl;
    }
}

