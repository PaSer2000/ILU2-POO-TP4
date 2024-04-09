package produit;

public class Poisson extends Produit {
	private String dateDePeche;
	private double prixFixe;

	public Poisson(String dateDePeche, double prixFixe) {
		super("poisson", "unite");
     	this.dateDePeche = dateDePeche;
     	this.prixFixe = prixFixe;
	}

	public String decrireProduit() {
		return "Poisson péché " + dateDePeche + ".";
	}
	
	 public double calculerPrix() {
		 return prixFixe;
	 }
}
