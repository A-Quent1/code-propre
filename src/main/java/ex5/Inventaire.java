package ex5;

import java.util.ArrayList;
import java.util.List;

public class Inventaire {

	private List<Caisse> caisses;
	
	public Inventaire() {

		int valeurMax = Integer.MAX_VALUE;
		
		caisses = new ArrayList<>();
		
		caisses.add(new Caisse("Petits objets", 0, 20));
		caisses.add(new Caisse("Moyens objets", 21, 50));
		caisses.add(new Caisse("Grands objets", 51, valeurMax));
	}
	
	public int taille() {

		int tailleTotale = 0;
		for (Caisse c : caisses) {
			tailleTotale = tailleTotale + c.getItems().size();
		}
		return tailleTotale;
	}

	public void addItem(Item item) {
		
		for (Caisse c : caisses) {
			if (c.controlePoids(item)) {
				c.getItems().add(item);
			}
		}
	}
}
