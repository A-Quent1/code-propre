package ex5;

import java.util.ArrayList;
import java.util.List;

public class Caisse {
	
	/** nom : le nom de la caisse */
	private String nom;
	/** capaciteMin : la capacite minimale de la caisse */
	private int capaciteMin;
	/** capaciteMax : la capacite maximale de la caisse */
	private int capaciteMax;
	/** items : liste des items dans la caisse */
	private List<Item> items;

	/** Constructeur
	 * @param nom
	 */
	public Caisse(String nom, int capaciteMin, int capaciteMax) {
		super();
		this.nom = nom;
		this.capaciteMin = capaciteMin;
		this.capaciteMax = capaciteMax;
		this.items = new ArrayList<>();
	}
	
	/**
	 * Permet de controler le poids d'un item en retournant true s'il est valide
	 * et false s'il n'est pas bon
	 * @param item de type Item
	 */
	public boolean controlePoids(Item item) {
		if (item.getPoids() >= capaciteMin && item.getPoids() <= capaciteMax) {
			return true;
		}
		return false;
	}
	/** Getter pour l'attribut nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter pour l'attribut nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getCapaciteMin() {
		return capaciteMin;
	}

	/** Setter pour l'attribut capaciteMin
	 * @param capaciteMin the capaciteMin to set
	 */
	public void setCapaciteMin(int capaciteMin) {
		this.capaciteMin = capaciteMin;
	}

	/** Getter pour l'attribut capaciteMax
	 * @return the capaciteMax
	 */
	public int getCapaciteMax() {
		return capaciteMax;
	}

	/** Setter pour l'attribut capaciteMax
	 * @param capaciteMax the capaciteMax to set
	 */
	public void setCapaciteMax(int capaciteMax) {
		this.capaciteMax = capaciteMax;
	}

	/** Getter pour l'attribut items
	 * @return the items
	 */
	public List<Item> getItems() {
		return items;
	}

	/** Setter pour l'attribut items
	 * @param items the items to set
	 */
	public void setItems(List<Item> items) {
		this.items = items;
	}

	/** Getter pour l'attribut capaciteMin
	 * @return the capaciteMin
	 */
	
}
