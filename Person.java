
package labor3;


/**
 * Aufgabe 3
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Person {

    private final int personalNr;
    private String anrede;
    private String vorname;
    private String nachname;
    
//----------------------------------------------------------------------------------
   
    public final int getPersonalNr() {return this.personalNr;}
    
    private final void setAnrede (final String anrede) {this.anrede = anrede;}
    public final String getAnrede() {return this.anrede;}
    
    public final void setVorname (final String vorname) {this.vorname = vorname;}
    public final String getVorname() {return this.vorname;}
    
    public final void setNachname (final String nachname) {this.nachname = nachname;}
    public final String getNachname() {return this.nachname;}
 
//-------------------------------------------------------------------------------------

//Konstruktoren in die eine Richtung
/*   
    public Person(final int nummer)
    {
        this(nummer,"Miss");
    }
    
    public Person   (final int nummer,
                    final String anrede)
    {
        this(nummer,anrede,"Duck");
    }
    
    public Person   (final int nummer,
                    final String anrede,
                    final String nachname)
    {
        this(nummer,anrede,anrede.equals("Miss")?"Daisy":"Donald",nachname);
    }
    
    public Person   (final int nummer,
                    final String anrede,
                    final String vorname,
                    final String nachname)
    {
        this.personalNr = nummer;
        this.setAnrede (anrede);
        this.setVorname (vorname);
        this.setNachname (nachname);
    }
*/

//-------------------------------------------------------------------------------

//und in die andere Richtung
    public Person(final int nummer)
    {
        this.personalNr = nummer;
        this.setAnrede("Miss");
        this.setVorname("Daisy");
        this.setNachname("Duck");
    }    

    public Person   (final int nummer,
                    final String anrede)
    {
        this(nummer);
        this.setAnrede(anrede);
        this.setVorname(anrede.equals("Miss")?"Daisy":"Donald");
    }
    
    public Person   (final int nummer,
                    final String anrede,
                    final String nachname)
    {
        this(nummer,anrede);
        this.setNachname(nachname);
    }
    
    public Person (final int nummer,
                    final String anrede,
                    final String vorname,
                    final String nachname)
    {
        this(nummer,anrede,nachname);
        this.setVorname(vorname);
    }

    
    @Override
    public String toString() 
    {
        return String.format("%s[%d, %s, %s, %s]", getClass().getName(), 
             getPersonalNr(), getAnrede(), getVorname(), getNachname());
    }
    
    public void print(Ausgabe printer) {
        printer.print(this.getPersonalNr());
    }
    
}
