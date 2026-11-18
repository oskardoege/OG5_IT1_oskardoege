


public class Suchalgorithmen {

    public static int linearsuche(long[] a, long gesucht) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == gesucht) {
                return i;
            }
        }

        return -1;
    }

    public static int interpolationssuche(long[] a, long gesucht) {

        int links = 0;
        int rechts = a.length - 1;

        while (links <= rechts &&
               gesucht >= a[links] &&
               gesucht <= a[rechts]) {

            if (a[links] == a[rechts]) {
                return a[links] == gesucht ? links : -1;
            }

            int pos = links + (int) (
                (gesucht - a[links]) * (long) (rechts - links)
                / (a[rechts] - a[links])
            );

            if (a[pos] == gesucht) {
                return pos;
            } else if (a[pos] < gesucht) {
                links = pos + 1;
            } else {
                rechts = pos - 1;
            }
        }

        return -1;
    }
}

