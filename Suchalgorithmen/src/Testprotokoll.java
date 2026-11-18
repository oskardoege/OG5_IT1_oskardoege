

public class Testprotokoll {

    public static void main(String[] args) {

        final int ANZAHL = 20000000;

        
        long[] a = SortedListGenerator.getSortedList(ANZAHL);

        
        long[] testwerte = {
            a[0],
            a[ANZAHL / 2],
            a[ANZAHL - 1],
            -1
        };

        String[] testnamen = {
            "Erste Zahl",
            "Mittlere Zahl",
            "Letzte Zahl",
            "Nicht vorhandene Zahl"
        };

        
        System.out.println("Anzahl Elemente: " + ANZAHL);

        for (int i = 0; i < testwerte.length; i++) {

            long gesucht = testwerte[i];

            System.out.println("\nTest: " + testnamen[i]);
            System.out.println("Gesuchte Zahl: " + gesucht);

            
            long startLinear = System.nanoTime();

            int indexLinear =
                Suchalgorithmen.linearsuche(a, gesucht);

            long endeLinear = System.nanoTime();

            
            long startInterpolation = System.nanoTime();

            int indexInterpolation =
                Suchalgorithmen.interpolationssuche(a, gesucht);

            long endeInterpolation = System.nanoTime();

            
            System.out.println("\nLinearsuche:");
            System.out.println("Index: " + indexLinear);
            System.out.println("Zeit: " +
                (endeLinear - startLinear) / 1000 + " µs");

            System.out.println("\nInterpolationssuche:");
            System.out.println("Index: " + indexInterpolation);
            System.out.println("Zeit: " +
                (endeInterpolation - startInterpolation) / 1000 + " µs");

           
        }

       
    }
}
