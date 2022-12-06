package ex1;
/** Classe qui définie les attributs d'une Entreprise avec une méthode pour afficher le statut
 * 
 * @author Quentin
 */
import java.util.Date;

public class Entreprise {
	
	/** siret : numéro de siret de l'entreprise */
	public int siret;
	
	/** nom : nom de l'entreprise */
	public String nom;
	
	/** adresse : adresse de l'entreprise */
	public String adresse;
	
	/** dateCreation : date de création de l'entreprise */
	public Date dateCreation;
	
	/** CAPITAL_MAX : montant maximal du capital de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;
	
	/**
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		super();
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}


	/** Méthode pour afficher le statut d'une entreprise
	 * @return void
	 */
	public void Afficher_statut(){
		
	}


	/**Getter de siret
	 * @return siret de type int
	 */
	public int getSiret() {
		return siret;
	}


	/**Setter
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}


	/**Getter de nom
	 * @return nom de type String
	 */
	public String getNom() {
		return nom;
	}


	/**Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}


	/**Getter de adresse
	 * @return adresse de type String
	 */
	public String getAdresse() {
		return adresse;
	}


	/**Setter
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	/**Getter de dateCreation
	 * @return dateCreation de type Date
	 */
	public Date getDateCreation() {
		return dateCreation;
	}


	/**Setter
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	/**Getter de CAPITAL_MAX
	 * @return capitalMax de type int
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
}
