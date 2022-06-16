package valutazioni;

import java.util.Random;

public class Main {
	
	public static void main (String[] args) {
		
		Studente[] arrayStudente = new Studente[20];
		
		Random r = new Random();
		
		int studProm=0;
		
		for (int i=0; i<arrayStudente.length; i++) {
			int assenze = r.nextInt(100);
			float mediaVoti = (r.nextFloat() * 5);
			arrayStudente[i] = new Studente(i+1, assenze, mediaVoti);
			
			System.out.printf("Id: %2d Valutazione: ", (i+1) );
			
			
			
			if (arrayStudente[i].valutazione()) {
				System.out.println("Promosso");
				studProm++;
			}else {
				System.out.println("Bocciato");
			}
			
		}
		System.out.println("in totale sono stati promossi " +studProm+" studenti");
	}

}
