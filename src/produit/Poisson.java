package produit;

public class Poisson extends Produit {
	private String dateDePeche;

	public Poisson(String dateDePeche) {
		super("poisson", "unité");
     	this.dateDePeche = dateDePeche;
	}

	public String decrireProduit() {
		return "Poisson pêché " + dateDePeche + ".";
	}
}
