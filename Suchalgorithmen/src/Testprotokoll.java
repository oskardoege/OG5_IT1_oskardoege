

public class Testprotokoll {

    public static void main(String[] args) {

        final int ANZAHL = 20000000;

        
        long[] a = SortedListGenerator.getSortedList(ANZAHL);

        
        long[] testwerte = {
             1000000,  2000000,  3000002,  4000001,  5000000,  6000000,
             7000000,  8000002,  9000000,  10000001,  11000001,  12000000,  13000000,
             14000000,  15000000,  16000001,  17000002,  18000000,  19000001,
            a[ANZAHL - 1],  -1
        };

        

        
        System.out.println("Anzahl Elemente: " + ANZAHL);

        for (int i = 0; i < testwerte.length; i++) {

            long gesucht = testwerte[i];

            System.out.println("\nTest: " );
            System.out.println(gesucht + ":");

            
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
                (endeLinear - startLinear) / 1000 + " ns");

            System.out.println("\nInterpolationssuche:");
            System.out.println("Index: " + indexInterpolation);
            System.out.println("Zeit: " +
                (endeInterpolation - startInterpolation) / 1000 + " ns");

           
        }

       
    }
}
