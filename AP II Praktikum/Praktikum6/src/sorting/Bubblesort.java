package sorting;
public class Bubblesort implements IntSort {
    /**
     * Der Algorithmus BubbleSort (direktes Vertauschen) funktioniert wie folgt:
     * <p>
     * Fuer jeden Durchlauf der aeusseren Schleife geht man beginnend mit a[i]
     * durch. Dabei vergleicht man 2 aufeinanderfolgende Feldinhalte und 
     * vertauscht sie, falls sie in der falschen Reihenfolge stehen.
     * <p>
     * Ein korrekter Ablauf wird durch die folgenden Ausgaben dargestellt:
     * <pre>
     * BubbleSort: [7, 1, 6, 2, 3, 8, 4, 5| ] 
     * BubbleSort: [1, 6, 2, 3, 7, 4, 5| 8] 
     * BubbleSort: [1, 2, 3, 6, 4, 5| 7, 8] 
     * BubbleSort: [1, 2, 3, 4, 5| 6, 7, 8] 
     * BubbleSort: [1, 2, 3, 4| 5, 6, 7, 8] 
     * BubbleSort: [1, 2, 3| 4, 5, 6, 7, 8] 
     * BubbleSort: [1, 2| 3, 4, 5, 6, 7, 8] 
     * BubbleSort: [1, 2, 3, 4, 5, 6, 7, 8]
     * </pre>
     * Der Strich | trennt den unsortierten von dem sortierten Teil.
     */
//    public void sort(int[] array) {
//    	int tmp = 0;
//    	for (int i = 1; i < array.length; i++) {
//			for (int j = 0; j < array.length - i; j++) {
//				if (array[j] > array[j+1]) {
//					tmp = array[j+1];
//					array[j+1] = array[j];
//					array[j] = tmp;
//				}
//			}
//		}
//    }
















/*
 * // O(n^2)
    	int tmp;
    	for (int i = 1; i <= array.length; i++) {
    		for(int j = 0; j < array.length - i; j++) {
    			if(array[j] > array[j+1]) {
    				tmp = array[j];
    				array[j] = array[j+1];
    				array[j+1] = tmp;
    			}
    		}
    	}
    	*/

// optimiert
	public void sort(int[] array) {
    	boolean done = false;
    	int tmp = 0;
    	for (int i = array.length-1; i > 0 && !done; i--) {
    		done = true;
			for (int j = 0; j < i; j++) {
				if (array[j] > array[j+1]) {
					tmp = array[j+1];
					array[j+1] = array[j];
					array[j] = tmp;
					done = false;
				}
			}
		}
    }
}
