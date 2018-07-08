package MasterMind;

import java.util.Random;
import java.util.Scanner;
/**
 * Funtionele doelstellingen:
 * @author Sjonnie
 *
 *1.CHECK random genereer een geheime array van 4 kleuren, kiezende uit 6 kleuren
 *2. CHECK maak string van de integer random lijst
 *3.CHECK laat computer vragen om een input van 4 kleuren
 *	 CHECK Array maken van de gegeven 4 kleuren
 *4.CHECK de 6  kleuren boolean checken of die/deze voorkomen in de geheime array
 *5.CHECK checken hoevaak ze voorkomen, dit teruggeven
 *	bij zelfde kleuren toch maar 1 kleur optellen 
 *6.stoppen door op Q te drukken
 *7. CHECK checken hoeveel er op de goede plek staan
 *
 */

class MasterMind {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] RandomArray = new int[4];
		String [] RandomArrayString  = {"","","","","",""};
		
		for (int i=0; i < 4; i++ ) {
			Random toeval = new Random();
			int getal = toeval.nextInt(6) + 1;
			RandomArray[i] = getal;
		}
//		System.out.println(RandomArray[1]);
			
		for (int i = 0; i < 4; i++) {
			if (RandomArray[i] == 1) {
				RandomArrayString[i] = "rood";
			}
			else if (RandomArray[i] == 2) {
				RandomArrayString[i] = "geel";
			}
			else if (RandomArray[i] == 3) {
				RandomArrayString[i] = "groen";
			}
			else if (RandomArray[i] == 4) {
				RandomArrayString[i] = "blauw";
			}	
			else if (RandomArray[i] == 5) {
				RandomArrayString[i] = "paars";
			}
			else if (RandomArray[i] == 6) {
				RandomArrayString[i] = "oranje";
			}
		}
//		GAME ZELF		
		boolean doorgaan = true;
		while (doorgaan){
			System.out.println("Raad de code. Voer de 4 kleuren in. (keuze uit: rood, oranje, blauw, geel, groen, paars)");
			String j = sc.nextLine();
			if(j == "Q") {	
				doorgaan = false; 
			}
			
			String [] antwoordArray = j.split(" ");
			
			int hoevaakVoorkomen = 0;
			int meerDanEen = 0;
			for(int i=0;i<4;i++) {
				if (RandomArrayString[i].contains(antwoordArray[0]) || RandomArrayString[i].contains(antwoordArray[1]) || 
						RandomArrayString[i].contains(antwoordArray[2]) || RandomArrayString[i].contains(antwoordArray[3])) 
					{
					hoevaakVoorkomen = hoevaakVoorkomen + 1;
					meerDanEen = meerDanEen + 1;
						if (meerDanEen > 1) {
							hoevaakVoorkomen = hoevaakVoorkomen -1;
						}
					}	
			}
			int juistePlek = 0;
			for(int i=0;i<4;i++) {
				if (RandomArrayString[i].equals(antwoordArray[i])) {
					juistePlek = juistePlek + 1;
				}
			}
					
			System.out.println("Van deze kleur(en) staat/staan er " + hoevaakVoorkomen + " in.");		
			System.out.println("Van deze kleur(en) staat/staan er " + juistePlek + " op de juiste plek.");
		}
		
		System.out.println("de code was:");
		for (int i=0; i<4; i++) {
			System.out.print(RandomArrayString[i] + " ");
		}
	}
}
