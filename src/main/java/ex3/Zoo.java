package ex3;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	/** nom : le nom du zoo */
	private String nom;
	/** animaux : la liste des animaux du zoo, dépend de la classe Animal */
	private List<Animal> animaux;
	
	/*
	 * @param nom
	 */
	public Zoo(String nom){
		this.nom = nom;
		this.animaux = new ArrayList<Animal>();
	}
	
	/**
	 * Permet d'ajouter un nouvel animal au zoo
	 * @param animal de type Animal
	 */
	
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	/*
	 * Permet d'afficher la liste de tout les animaux
	 */
	public void afficherListeAnimaux(){
		for (Animal a: animaux) {
			System.out.println(a);
		}
	}
	
	/*
	 * Permet de voir la quantité d'animaux présent dans le zoo
	 */
	public int tailleDuZoo() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
