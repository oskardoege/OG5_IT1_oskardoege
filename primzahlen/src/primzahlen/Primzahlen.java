
package primzahlen;
import java.util.*;

public class Primzahlen {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        long a = s.nextLong();

       

            long startZeit = System.nanoTime();

            boolean ergebnis = isPrim(a);

            long endZeit = System.nanoTime();

            long dauerNano = endZeit - startZeit;
            double dauerMilli = dauerNano / 1_000_000.0;

            
            System.out.println("Primzahl: " + ergebnis);
            System.out.println("Laufzeit: " + dauerMilli + " Millisekunden");
            

           
        

        s.close();
    }

    public static boolean isPrim(long zahl) {

        boolean prim = true;

        if (zahl <= 1) {
            prim = false;
        } else {
            for (long i = 2; i < zahl - 1; i++) {
                if (zahl % i == 0) {
                    prim = false;
                    break;
                }
            }
        }

        return prim;
    }
}
