package labor3;

/**
 * Aufgabe 3 c)
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Adresse {
// Attribute
    private final int plz;
    private final String ort;
    private final String str;
    private final int nr;


// Konstruktoren
    Adresse(final int plz, final String ort, final String str, final int nr) {
        this.plz = plz;
        this.ort = ort;
        this.str = str;
        this.nr = nr;
    }

// Getter und Setter    
    final int getPlz() {
        return this.plz;
    }

    final String getOrt() {
        return this.ort;
    }

    final String getStr() {
        return this.str;
    }

    final int getNr() {
        return this.nr;
    }

// Ausgabefunktionen
    // Setzt basis Attribute einer Adresse in String um
    @Override
    public String toString() {
        return String.format("%s %d, %d %s", this.getStr(), this.getNr(), this.getPlz(), this.getOrt());
    }

}
