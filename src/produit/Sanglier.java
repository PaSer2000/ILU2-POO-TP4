package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	 private double poids;
	 private Gaulois chasseur;

	 public Sanglier(double poids, Gaulois chasseur) {
	     super("sanglier", "kg");
	     this.poids = poids;
	     this.chasseur = chasseur;
	 }

	 public String decrireProduit() {
	     return "Sanglier de " + poids + " kg chassé par " + chasseur + ".";
	 }
}