package primzahlen;
import java.util.*;
public class Primzahlen {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long a= s.nextLong();
		System.out.print(isPrim(a));
		long endZeit = System.nanoTime();

        long dauerNano = endZeit - startZeit;
        double dauerMilli = dauerNano / 1_000_000.0;

        System.out.println("Laufzeit: " + dauerMilli + " Millisekunden");
	}
	public static boolean isPrim(long zahl){
		boolean prim = true;
		if(zahl==1) {
			prim = true;
		}else {
			for (long i = 2; i < zahl-1; i++) {
				if (zahl% i ==0) {
					prim=false;
					i = zahl;
				}
			}
		}
		return prim;
	}
}
