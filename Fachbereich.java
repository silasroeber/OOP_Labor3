package labor3;

/**
 * Aufgabe 3 c)
 *
 * @author  Eike Hoffmann   <eike.s.hoffmann@student.fh-kiel.de>
 * @author  Silas Röber     <silas.roeber@student.fh-kiel.de>
 */
public class Fachbereich {

    
    private String bezeichnung;
    private Person[] dozenten = null;
    protected Professor dekan = null;
    protected Professor proDekan = null;
    protected Adresse adresse = null;
    
    // Getter&Setter
    public final String getBezeichnung() {
        return bezeichnung;
    }

    public final void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public final Person[] getDozenten() {
        return dozenten;
    }

    public final void setDozenten(Person[] dozenten) {
        this.dozenten = dozenten;
    }

    public final Professor getDekan() {
        return dekan;
    }

    public final void setDekan(Professor dekan) {
        this.dekan = dekan;
        if (dekan.getFachbereich() != this) {
            dekan.setFachbereich(this);
        }
    }

    public final Professor getProDekan() {
        return proDekan;
    }

    public final void setProDekan(Professor proDekan) {
        this.proDekan = proDekan;
        if (proDekan.getFachbereich() != this) {
            proDekan.setFachbereich(this);
        }
    }

    public final Adresse getAdresse() {
        return adresse;
    }

    public final void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
    
    // Konstruktor
    public Fachbereich(String name,
                       Adresse adresse){
        this.setBezeichnung(name);
        this.setAdresse(adresse);
    }
    
    public Fachbereich(String name,
                       Professor dekan,
                       Professor proDekan,
                       Adresse adresse){
        this(name, adresse);
        this.setDekan(dekan);
        this.setProDekan(proDekan);
    }
    
    // weitere Funktionen
    public void mitarbeiterHinzufügen(Person neuerDozent) {
        Person[] dozenten = this.getDozenten();
        Person[] tmp;

        if(dozenten != null) {
            tmp = new Person[dozenten.length + 1];
            for(int i = 0; i < dozenten.length; ++i) {
                tmp[i] = dozenten[i];
            }
            tmp[dozenten.length] = neuerDozent;
        } else {
            tmp = new Person[1];
            tmp[0] = neuerDozent;
        }

        this.setDozenten(tmp);
    }
 
    
    public void mitarbeiterEntfernen(Person alterDozent) {
        Person[] dozenten = this.getDozenten();

        if(dozenten != null) {
            Person[] tmp = new Person[dozenten.length-1];

            int it = 0;

            for(Person p : dozenten) {
                if(p == alterDozent) continue;
                tmp[it++] = p;
            }

            setDozenten(tmp);
        }
    }
    
    // Ausgabefunktion
    @Override
    public String toString() {
        return this.getBezeichnung();
    }
    
    public String mitarbeiterString()
    {
        StringBuilder stringBuilder = new StringBuilder();
        Person[] mitarbeiter = this.getDozenten();

        stringBuilder.append(String.format("Fachbereich: %s%n",
                                           this.toString()));

        if(mitarbeiter != null) {
            stringBuilder.append(String.format("Mitarbeiter: "));
            for(int i = 0; i < mitarbeiter.length; ++i) {
                stringBuilder.append(mitarbeiter[i].ausgabeName());
                stringBuilder.append(System.lineSeparator());
                if(i + 1 < mitarbeiter.length) stringBuilder.append("             ");
            }
        }
        return stringBuilder.toString();
    }
    
    public void print(Ausgabe printer) {
        printer.print(this.mitarbeiterString());
    }
}


