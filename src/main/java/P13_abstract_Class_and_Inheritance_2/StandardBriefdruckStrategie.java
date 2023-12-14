package P13_abstract_Class_and_Inheritance_2;

public class StandardBriefdruckStrategie implements BriefdruckStrategie{

    public void druckeBrief(Brief brief){

        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Absender: \n")
                .append(brief.getSender().getVorname())
                .append(" ")
                .append(brief.getSender().getNachname())
                .append("\n")
                .append(brief.getSender().getStrasse())
                .append(" ")
                .append(brief.getSender().getHausnummer())
                .append("\n")
                .append(brief.getSender().getPlz())
                .append(" ")
                .append(brief.getSender().getOrt())
                .append("\n\n")

                .append("Empfänger: \n")
                .append(brief.getEmpfaenger().getVorname())
                .append(" ")
                .append(brief.getEmpfaenger().getNachname())
                .append("\n")
                .append(brief.getEmpfaenger().getStrasse())
                .append(" ")
                .append(brief.getEmpfaenger().getHausnummer())
                .append("\n")
                .append(brief.getEmpfaenger().getPlz())
                .append(" ")
                .append(brief.getEmpfaenger().getOrt())
                .append("\n\n")

                .append("Inhalt: \n")
                .append(brief.getInhalt().getDatum())
                .append("\n")
                .append(brief.getInhalt().getTitel())
                .append("\n")
                .append(brief.getInhalt().getAnrede())
                .append("\n")
                .append(brief.getInhalt().getText())
                .append("\n\n");

        String brieftext = stringBuilder.toString();


        System.out.println(brieftext);
    }
}
