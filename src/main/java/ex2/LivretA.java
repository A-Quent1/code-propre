package ex2;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author Quentin
 */
public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	public double tauxRemuneration;

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}
	
	/** Méthode qui applique une rémunération annuelle si le type du compte est LA
	 * Additionne le solde du compte avec le solde du compte multiplier par le pourcentage de rémunération
	 * @return void
	 */
	public void appliquerRemuAnnuelle(){
		if (getType().equals("LA")){
			setSolde(getSolde() + getSolde()*tauxRemuneration/100);
		}
	}
	
	/**Getter de tauxRemuneration
	 * @return tauxRemuneration de type double
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**Stter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
