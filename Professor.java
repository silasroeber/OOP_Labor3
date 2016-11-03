package labor3;

<<<<<<< HEAD

/**
 * Aufgabe 3 a) b.
=======
/**
 * Aufgabe 3
>>>>>>> origin/master
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Professor extends Person {

<<<<<<< HEAD
    protected int personalNr;
    protected Datum eintrittsDatum;
    protected Fachbereich fachbereich = null;
    
=======
    private int personalNr;
    private Datum eintrittsDatum;
    private Fachbereich fachbereich;
>>>>>>> origin/master

    public final int getPersonalNr() {
        return personalNr;
    }

    public final void setPersonalNr(int personalNr) {
        this.personalNr = personalNr;
    }

    public final Datum getEintrittsDatum() {
        return eintrittsDatum;
    }

    public final void setEintrittsDatum(Datum eintrittsDatum) {
        this.eintrittsDatum = eintrittsDatum;
    }

    public final Fachbereich getFachbereich() {
        return fachbereich;
    }

    public final void setFachbereich(Fachbereich fachbereich) {
        if (this.fachbereich != null) {
            this.fachbereich.mitarbeiterEntfernen(this);
        }
        this.fachbereich = fachbereich;
        this.fachbereich.mitarbeiterHinzufügen(this);  
    }


    public Professor(int personalNr, 
                     Datum eintrittsDatum, 
                     Fachbereich fachbereich, 
                     int nummer, 
                     String anrede, 
                     String vorname, 
                     String nachname) {
        super(nummer, anrede, vorname, nachname);
        this.setPersonalNr(personalNr);
        this.setEintrittsDatum(eintrittsDatum);
        this.setFachbereich(fachbereich);
    }
    
    public String statusBerechnen() {
        int diff = this.getEintrittsDatum().diffJahre();
        if(diff < 5) {
            return "Innovationsträger";
        } else {
            if(diff < 25) {
                return "Etabliert";
            }
            return "Rentner in Spe";
        }
    }
    
    @Override
    public String toString() 
    {
        return String.format("%s[%d, %s, %s]", super.toString(), 
                this.getPersonalNr(), this.getFachbereich().toString(),
                this.statusBerechnen());
    }
   

}
