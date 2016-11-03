package labor3;

/**
 * Aufgabe 3
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Professor extends Person {

    private int personalNr;
    private Datum eintrittsDatum;
    private Fachbereich fachbereich;

    public Professor(int nr) {
        super(nr);
    }

}
