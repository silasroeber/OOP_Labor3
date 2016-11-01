package labor3;

/**
 * Created by eike on 01.11.16.
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
