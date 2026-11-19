package de.promocode.logic;

public class CodeSearch {

	public static int NOT_FOUND = -1;

	public static long findPromoCode(long[] list, long searchValue) {

        int links = 0;
        int rechts = list.length - 1;

        while (links <= rechts &&
               searchValue >= list[links] &&
               searchValue <= list[rechts]) {

            if (list[links] == list[rechts]) {
                return list[links] == searchValue ? links : -1;
            }

            int pos = links + (int) ((searchValue - list[links]) * (long) (rechts - links) / (list[rechts] - list[links]));

            if (list[pos] == searchValue) {
                return pos;
            } else if (list[pos] < searchValue) {
                links = pos + 1;
            } else {
                rechts = pos - 1;
            }
        }

        return NOT_FOUND;
    }
	
	/**long startLinear = System.nanoTime();
	public static int findPromoCode(long[] list, long searchValue) {
		for (int i = 0; i < list.length; i++) {
			if (list[i] == searchValue)
				return i;
		}

		return NOT_FOUND;
	}*/

}
