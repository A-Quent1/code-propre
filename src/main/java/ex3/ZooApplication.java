package ex3;
/** Classe de test pour l'ajout et l'affichage des animaux
 * 
 * @author Quentin
 */
public class ZooApplication {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal ("MAMMIFERE", "Gazelle", TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal ("MAMIFERE", "Zèbre", TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal ("MAMIFERE", "Lion", TypeComportement.CARNIVORE));
		zoo.addAnimal(new Animal ("MAMMIFERE", "Panthère", TypeComportement.CARNIVORE));
		zoo.addAnimal(new Animal ("POISSON", "Requin blanc", TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal ("POISSON", "Truite dorée", TypeComportement.HERBIVORE));
		zoo.addAnimal(new Animal ("SERPENT", "Boa constrictor", TypeComportement.CARNIVORE));
		zoo.addAnimal(new Animal ("SERPENT", "Python", TypeComportement.CARNIVORE));
		
		zoo.afficherListeAnimaux();
	}

}
