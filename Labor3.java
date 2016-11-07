
package labor3;

/**
 * Aufgabe 3
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Labor3 {

    public static void main(String[] args) {
        //Person p = new Person(1);
        //p.print(new BildschirmAusgabe());

        Fachbereich fachber1 = new Fachbereich("I&E", new Adresse(24149, "Kiel", "Grenzstr.", 3));
        
        Professor prof1 = new Professor(22, new Datum(22, 03, 2007), fachber1, 2, "Herr Prof. Dr.", "Georg", "Splitt");
        Lehrbeauftragter lehrbe1 = new Lehrbeauftragter(33, new Datum(13, 05, 2014), fachber1, 3, "Herr Dipl. Ing.", "Hans", "Diestel");
        Student stud1 = new Student(915555, 16, fachber1, 4, "Herr", "Bummel", "Lant");

        BildschirmAusgabe ausgabe = new BildschirmAusgabe();

        prof1.print(ausgabe);
        lehrbe1.print(ausgabe);
        stud1.print(ausgabe);
        
        fachber1.setDekan(prof1);

        fachber1.print(ausgabe);
    }
  
    
}
