package P13_abstract_Class_and_Inheritance_2;

/**
 * Diese Klasse implementiert einen Briefdrucker
 * 
 * @author tebe
 */
public class Briefdrucker {
  
	BriefdruckStrategie strategie;

    public Briefdrucker(BriefdruckStrategie strategie){
        this.strategie = strategie;
    }

    public void druckeBrief(Brief brief){
        strategie.druckeBrief(brief);
    }

    public void setStrategie(BriefdruckStrategie strategie){
        this.strategie = strategie;
    }

}
