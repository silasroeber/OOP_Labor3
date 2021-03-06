package labor3;

/**
 * Aufgabe 3 b) a.
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

    @Override
    public void print(long li) {
        System.out.println(li);
    }

    @Override
    public void print(double lf) {
        System.out.println(lf);
    }

    @Override
    public void print(boolean b) {
        System.out.println(b?"yes":"no");
    }

}
