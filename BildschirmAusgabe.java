package labor3;

/**
<<<<<<< HEAD
 * Aufgabe 3 b) a.
=======
 * Aufgabe 3
>>>>>>> origin/master
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class BildschirmAusgabe implements Ausgabe {
    
    @Override
    public void print(int i) {
        System.out.println(i);
    }

    @Override
    public void print(float f) {
        System.out.println(f);
    }

    @Override
    public void print(String s) {
        System.out.println(s);
    }

}
