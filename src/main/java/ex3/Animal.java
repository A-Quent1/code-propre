package ex3;

public class Animal {
	
	/** typeAnimal : il s'agit du type de l'animal ( mammifère, reptile, ... )*/
	private String typeAnimal;
	/** nomAnimal : le nom de l'animal concerné */
	private String nomAnimal;
	/** comportement : 3 choix possibles entre Omnivore, Herbivore et Carnivore */
	private TypeComportement comportement;
	
	/**
	 * @param typeAnimal
	 * @param nomAnimal
	 * @param comportement
	 */
	public Animal(String typeAnimal, String nomAnimal, TypeComportement comportement) {
		super();
		this.typeAnimal = typeAnimal;
		this.nomAnimal = nomAnimal;
		this.comportement = comportement;
	}
	
	/*
	 * Permet d'afficher un animal avec ses parametres
	 */
	public String toString() {
		
		return nomAnimal+" qui est un "+typeAnimal+" avec un comportement "+comportement;
	}
	/**
	 * @return the typeAnimal
	 */
	public String getTypeAnimal() {
		return typeAnimal;
	}
	/**
	 * @param typeAnimal the typeAnimal to set
	 */
	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}
	/**
	 * @return the nomAnimal
	 */
	public String getNomAnimal() {
		return nomAnimal;
	}
	/**
	 * @param nomAnimal the nomAnimal to set
	 */
	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	/**
	 * @return the comportement
	 */
	public TypeComportement getComportement() {
		return comportement;
	}
	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(TypeComportement comportement) {
		this.comportement = comportement;
	}

}
