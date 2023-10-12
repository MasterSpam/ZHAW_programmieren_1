package P3_object_interaction;

public class Kuenstler {

    private String bezeichnung;
    private int gage;

    public Kuenstler(String bezeichnung, int gage){
        this.bezeichnung = bezeichnung;
        this.gage = gage;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getGage() {
        return gage;
    }
}
