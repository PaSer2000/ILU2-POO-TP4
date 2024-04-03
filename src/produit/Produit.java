package produit;

public abstract class Produit {
	private String nom;
	private String unité;
	
	protected Produit(String nom, String unité) {
		this.nom = nom;
		this.unité = unité;
	}

	public String getNom() {
		return nom;
	}
	
	public abstract String decrireProduit();

}
