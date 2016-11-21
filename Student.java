package labor3;

/**
 * Aufgabe 3 a) a. + e)
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Student extends Person {

// Attribute
    private int matrikelNr;
    private int semester;
    private Fachbereich fachbereich;

// Getter&Setter
    public final int getMatrikelNr() {
        return matrikelNr;
    }

    public final void setMatrikelNr(int matrikelNr) {
        this.matrikelNr = matrikelNr;
    }

    public final int getSemester() {
        return semester;
    }

    public final void setSemester(int semester) {
        this.semester = semester;
    }

    public final Fachbereich getFachbereich() {
        return fachbereich;
    }

    public final void setFachbereich(Fachbereich fachbereich) {
        this.fachbereich = fachbereich;
    }

// Konstruktoren
    public Student(int matrikelNr, 
                   int semester, 
                   Fachbereich fachbereich, 
                   int nummer, 
                   String anrede, 
                   String vorname, 
                   String nachname) {
        super(nummer, anrede, vorname, nachname);
        this.matrikelNr = matrikelNr;
        this.semester = semester;
        this.fachbereich = fachbereich;
    }

// weitere Funktionen
    // e) b.
    private String statusBerechnen() {
        int semster = this.getSemester();
        if(semester < 3) {
            return "Neuling";
        } else if(semster < 16) {
            return "Etabliert";
        } else if(semster == 16) {
            return "Bod'scher Spezialfall";
        }
        return "Bummelant";
    }

// weitere funktionen
    @Override
    public String toString() 
    {
        return String.format("%s[%d, %s, %s]", super.toString(), 
                this.getMatrikelNr(), this.getFachbereich().toString(),
                this.statusBerechnen());
    }

}
