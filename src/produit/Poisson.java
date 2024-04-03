package produit;

public class Poisson extends Produit {
	private String dateDePeche;

	public Poisson(String dateDePeche) {
		super("poisson", "unit�");
     	this.dateDePeche = dateDePeche;
	}

	public String decrireProduit() {
		return "Poisson p�ch� " + dateDePeche + ".";
	}
}
