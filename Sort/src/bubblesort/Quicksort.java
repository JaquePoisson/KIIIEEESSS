package bubblesort;

public class Quicksort {
	private static int[] Input = new int[20];
	
	public static void main(String[] args) {
		for(int i = 0; i<20; i++) {
			Input[i] = (int) (Math.random()*100);
		}
		new Quicksort(0, Input.length-1);
	}

	public Quicksort(int links, int rechts) {
		
        int teiler = teile(links, rechts);
        new Quicksort(links, teiler);
        new Quicksort(teiler+1, rechts);
	}
	
	private int teile(int links, int rechts) {
		
	     		int i = links;
	    	     // Starte mit j links vom Pivotelement
	    	     int j = rechts - 1;
	    	     int pivot = Input[rechts];

	    	     do {

	    	         // Suche von links ein Element, welches größer als das Pivotelement ist
	    	         while( Input[i] < pivot && i < rechts - 1) {
	    	             i = i + 1;
	    	         }

	    	         // Suche von rechts ein Element, welches gleich oder kleiner als das Pivotelement ist
	    	         while(((j > links) && (Input[j] >= pivot))){
	    	              j = j - 1;
	    	         }

	    	         if(i < j) {
	    	             int temp = Input[i];
	    	             Input[i] = Input[j];
	    	             Input[j] = temp;
	    	         }
	    	         

	    	     }while( i < j);// solange i an j nicht vorbeigelaufen ist 

	    	    	 if(Input[i] > pivot){
	    	             int temp = Input[i];
	    	             Input[i] = Input[rechts];
	    	             Input[rechts] = temp;
	    	     }

	    	     // gib die Position des Pivotelements zurück

	    	     return i;
		
	}
}
