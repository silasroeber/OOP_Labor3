
package labor3;

/**
 * Aufgabe 3 a) c. + e)
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Lehrbeauftragter extends Person{


    
// Atribute
    private int personalNr;
    private Datum eintrittsDatum;
    private Fachbereich fachbereich = null;
    
// Getter&Setter
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
        if(this.fachbereich != null) {
            this.fachbereich.mitarbeiterHinzufuegen(this);
        }
    }

// Konstruktoren
    public Lehrbeauftragter(int personalNr, 
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
    
// weitere Funktionen
    // e) c.
    private String statusBerechnen() {
        int diff = this.getEintrittsDatum().diffJahre();
        if(diff < 5) {
            return "Innovationsträger";
        } else if(diff < 25) {
            return "Etabliert";
        }
        return "Rentner in Spe";
    }
    
// Ausgabefunktionen
    @Override
    public String toString() 
    {
        Fachbereich fachbereich = this.getFachbereich();

        return String.format("%s[%d, %s, %s]", super.toString(), 
                this.getPersonalNr(), fachbereich != null ? fachbereich.toString() : "-",
                this.statusBerechnen());
    }
    
}
