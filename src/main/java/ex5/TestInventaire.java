package ex5;

public class TestInventaire {

	public static void main(String[] args) {
		
		Inventaire inv = new Inventaire();
			inv.addItem(new Item("Stylo", 1));
			inv.addItem(new Item("Lot de livre", 23));
			inv.addItem(new Item("Fossile", 300));
			inv.addItem(null);
			
			System.out.println("Taille="+inv.taille());
	}

}
