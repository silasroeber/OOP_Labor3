
package labor3;

/**
 * Aufgabe 3 a) c.
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Lehrbeauftragter extends Professor{

// Konstruktor
    public Lehrbeauftragter(int personalNr, 
                            Datum eintrittsDatum, 
                            Fachbereich fachbereich, 
                            int nummer, 
                            String anrede, 
                            String vorname, 
                            String nachname) {
        super(personalNr, eintrittsDatum, fachbereich, nummer, anrede, vorname, nachname);
    }
    
    
    
}
