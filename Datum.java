
package labor3;

import java.util.Calendar;

/**
 * Aufgabe 3 a)
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Datum {
// Attribute
    private int tag;
    private int monat;
    private int jahr;

// Konstruktoren
    Datum() {
        // Nutzung von Calendar um einen default Konstruktor für "HEUTE" anzubieten
        Calendar cal = Calendar.getInstance();
        this.setTag(cal.get(Calendar.DATE));
        this.setMonat(cal.get(Calendar.MONTH) + 1);
        this.setJahr(cal.get(Calendar.YEAR));
    }

    Datum(final int tag, final int monat, final int jahr) throws IllegalArgumentException {
        this.setJahr(jahr);
        this.setMonat(monat);
        this.setTag(tag);
    }

// Getter und Setter    
    final int getJahr() {
        return this.jahr;
    }

    final void setJahr(final int jahr) throws IllegalArgumentException {
        if((1 > jahr) || (jahr > 3000))
            throw new IllegalArgumentException("Jahr sollte zwischen 1 und 3000 liegen");
        this.jahr = jahr;
    }

    final int getMonat() {
        return this.monat;
    }

    final void setMonat(final int monat) throws IllegalArgumentException {
        if((1 > monat) || (monat > 12))
            throw new IllegalArgumentException("Monat sollte zwischen 1 und 12 liegen");
        this.monat = monat;
    }

    final int getTag() {
        return this.tag;
    }

    final void setTag(final int tag) throws IllegalArgumentException {
        switch(monat) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if((1 > tag) || (tag > 31))
                    throw new IllegalArgumentException("Dieser Monat hat zwischen 1 und 31 Tagen");
                break;
            case 4: case 6: case 9: case 11:
                if((1 > tag) || (tag > 30))
                    throw new IllegalArgumentException("Dieser Monat hat zwischen 1 und 30 Tagen");
                break;
            case 2:
                if((1 > tag) || (tag > 28))
                    throw new IllegalArgumentException("Februar hat zwischen 1 und 28 Tagen");
                break;
        }
        this.tag = tag;
    }

// Ausgabefunktionen
    @Override
    public String toString() {
        return String.format("%d.%d.%d", getTag(), getMonat(), getJahr());
    }
    
// weitere Funktionen
    //vergleicht datum zu Heute
    public int diffJahre(){
        Datum heute = new Datum();

        int anzTage = this.getJahr() * 365 + (this.getMonat() - 1) * 30 + this.getTag();
        int anzTageHeute = heute.getJahr() * 365 + (heute.getMonat() - 1) * 30 + heute.getTag();

        return (anzTageHeute - anzTage) / 365;
    }

}
