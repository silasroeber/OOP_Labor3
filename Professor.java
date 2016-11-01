package labor3;

import java.util.Date;

/**
 * Created by eike on 29.10.16.
 */
public class Professor extends Person {

    private int personalNr;
    private Date eintrittsDatum;
    private Fachbereich fachbereich;

    public Professor(int nr) {
        super(nr);
    }

}
