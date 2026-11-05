
package primzahlen;
import java.util.*;

public class Primzahlen {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Startzahl eingeben: ");
        long a = s.nextLong();

        // 10 Durchgänge
        for (int durchgang = 1; durchgang <= 6; durchgang++) {

            long startZeit = System.nanoTime();

            boolean ergebnis = isPrim(a);

            long endZeit = System.nanoTime();

            long dauerNano = endZeit - startZeit;
            double dauerMilli = dauerNano / 1_000_000.0;

            System.out.println("Durchgang: " + durchgang);
            System.out.println("Zahl: " + a);
            System.out.println("Primzahl: " + ergebnis);
            System.out.println("Laufzeit: " + dauerMilli + " Millisekunden");
            System.out.println("-------------------------");

           
        }

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
