package produit;
import personnages.Gaulois;

public class Sanglier extends Produit {
	 private double poids;
	 private Gaulois chasseur;
	 private double prixFixe;

	 public Sanglier(double poids, Gaulois chasseur, double prixFixe) {
	     super("sanglier", "kg");
	     this.poids = poids;
	     this.chasseur = chasseur;
	     this.prixFixe = prixFixe;
	 }

	 public String decrireProduit() {
	     return "Sanglier de " + poids + " kg chass� par " + chasseur + ".";
	 }
	 
	 public double calculerPrix() {
		 return (prixFixe * poids) / 1000;
	 }
}