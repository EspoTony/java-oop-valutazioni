package valutazioni;

public class Studente {
	int id,assenze;
	float mediaVoti;
	
	Studente(int id, int assenze, float mediaVoti) {
	this.id = id;
	this.assenze = assenze;
	this.mediaVoti = mediaVoti;
	}
	
	boolean valutazione () {
		boolean promosso = false;
		
		if (assenze < 25 && mediaVoti>= 2) {
			promosso=true;
		} else if (assenze <= 50 && mediaVoti > 2) {
			promosso=true;
		}
		return promosso;
	}
}
