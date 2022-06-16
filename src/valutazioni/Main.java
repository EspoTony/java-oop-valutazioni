package valutazioni;

import java.util.Random;

public class Main {
	
	public static void main (String[] args) {
		
		Valutazioni[] arrayValutazioni = new Valutazioni[20];
		
		Random r = new Random();
		
		for (int i=0; i<arrayValutazioni.length; i++) {
			int assenze = r.nextInt(100);
			float mediaVoti = (r.nextFloat() * 5);
			arrayValutazioni[i] = new Valutazioni(i+1, assenze, mediaVoti);
			
			System.out.printf("Id: %2d Valutazione: ", (i+1) );
			
			int studProm=0;
			
			if (arrayValutazioni[i].Valutazione()) {
				System.out.println("Promosso");
				studProm++;
			}else {
				System.out.println("Bocciato");
			}
			System.out.println("in totale sono stati promossi " +studProm+" studenti");
		}
	}

}
