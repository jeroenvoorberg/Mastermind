package MasterMind;

class Wisselkaarten {
	
	public static void main(String[] args) {
			
		
		int[] Array = {7, 4, 2, 4, 6, 8, 4};
		int Rangeerplek;
		
		System.out.println("De gegeven volgorde is:"); 
		for(int i = 0; i < 7; i++) {
			System.out.print(Array[i] + " ");
		}
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if (Array[j] > Array[j+1]) {	
					Rangeerplek = Array[j];
					Array[j] = Array[j+1];
					Array[j+1] = Rangeerplek;	
				}
			}
		}
		System.out.println("");
		System.out.println("De juiste volgorde is:"); 
		for(int i = 0; i < 7; i++) {
			System.out.print(Array[i] + " ");
		}
	}
}