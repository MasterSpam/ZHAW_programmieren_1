package P2_class_definition_2;

public class Automodell {

    private String marke;
    private String type;
    private double hubraum;
    private boolean turbo;
    private int lagerbestand;

    public Automodell(String newMarke, String newType, double newHubraum, boolean newTurbo) {
        lagerbestand = 0;
        marke = checkString(newMarke) ? newMarke : "___";
        type = checkString(newType) ? newType : "___";
        hubraum = checkHubraum(newHubraum) ? newHubraum : 0;
        turbo = newTurbo;
    }

    private boolean checkString(String checkValue) {
        int wordLength = checkValue.length();
        boolean isValid = 3 <= wordLength && wordLength <= 10;

        if (!isValid) {
            System.out.println(checkValue + " has to be between 3 and 10 chars");
        }
        return isValid;
    }

    private boolean checkHubraum(double hubraum) {
        boolean isValid = 0.5 <= hubraum && hubraum <= 8;

        if (!isValid) {
            System.out.println("hubraum has to be between 0.5 and 8 liters");
        }
        return isValid;
    }

    private boolean checkChangeAmount(int changeAmount) {
        boolean amountIsValid = -10 <= changeAmount && changeAmount <= 10;
        boolean resultAmountIsValid = lagerbestand + changeAmount >= 0;

        if (!amountIsValid) {
            System.out.println("changeAmount has to be between -10 and 10");
        } else if (!resultAmountIsValid) {
            System.out.println("your change amount would decrease the Lagerbestand below zero");
        } else {
            System.out.println("old Lagerbestand: " + lagerbestand + "\nnew Lagerbestand: " + (lagerbestand + changeAmount));
        }

        return amountIsValid && resultAmountIsValid;

    }

    public void setMarke(String newMarkeName) {
        marke = checkString(newMarkeName) ? newMarkeName : marke;
    }

    public void setType(String newTypeName) {
        type = checkString(newTypeName) ? newTypeName : type;
    }

    public void setHubraum(double newHubraumSize) {
        hubraum = checkHubraum(newHubraumSize) ? newHubraumSize : hubraum;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }
     public void changeLagerbestand(int changeAmount) {
        lagerbestand = checkChangeAmount(changeAmount) ? lagerbestand + changeAmount : lagerbestand;
     }

     public void printAuto(){
        System.out.println(
                marke + " " + type + ", " + hubraum + " Liter\n" +
                "Code: " + marke.substring(0, 3) + "-" + type.substring(0, 3) + "-" + hubraum + "-" + (turbo ? "t\n" : "\n") +
                "Lagerbestand: " + lagerbestand);
     }


    public int getLagerbestand() {
        return lagerbestand;
    }
}
