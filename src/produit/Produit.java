package produit;

public abstract class Produit {
	private String nom;
	private String unit�;
	
	protected Produit(String nom, String unit�) {
		this.nom = nom;
		this.unit� = unit�;
	}

	public String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit();

}
