package villagegauloisold;

import personnages.Gaulois;
import produit.IProduit;

public class Etal <P extends IProduit> implements IEtal {
	private Gaulois vendeur;
	private P[] produits;
	private int nbProduits;
	private double prixProduit;
	
    public void installerVendeur(Gaulois vendeur, P[] produits, double prixProduit) {
        this.vendeur = vendeur;
        this.produits = produits;
        this.nbProduits = produits.length;
        this.prixProduit = prixProduit;
    }

	@Override
	public Gaulois getVendeur() {
		return vendeur;
	}

	@Override
	public double donnerPrix() {
		return prixProduit;
	}

	@Override
	public int contientProduit(String produit, int quantiteSouhaitee) {
		int quantiteAVendre = 0;
		int nbProduit = produits.length;
		if (nbProduit != 0 && produits[0].getNom().equals(produit)) {
			if (nbProduit >= quantiteSouhaitee) {
				quantiteAVendre = quantiteSouhaitee;
			} else {
				quantiteAVendre = nbProduit;
			}
		}
		return quantiteAVendre;
	}

	@Override
	public double acheterProduit(int quantiteSouhaitee) {
		double prixPaye = 0;
		int nbProduit = produits.length;
		for (int i = nbProduit - 1; i > nbProduit - quantiteSouhaitee - 1 || i > 1; i--) {
			prixPaye += produits[i].calculerPrix();
		}
		if (nbProduit >= quantiteSouhaitee) {
			nbProduit -= quantiteSouhaitee;
		} else {
			nbProduit = 0;
		}
		return prixPaye;

	}

	@Override
	public String etatEtal() {
		StringBuilder chaine = new StringBuilder(vendeur.getNom());
		int nbProduit = produits.length;
		if (nbProduit > 0) {
			chaine.append(" vend ");
			chaine.append(nbProduit + " produits :");
			for (int i = 0; i < nbProduit; i++) {
				chaine.append("\n- " + produits[i].decrireProduit());
			}
		} else {
			chaine.append(" n'a plus rien à vendre.");
		}
		chaine.append("\n");
		return chaine.toString();
	}

	@Override
	public int getNbProduit() {
		return nbProduits;
	}
}


/*------------------------------------------------------------------------------------------------------------------*/

/* CODE AVANT Nouveau Sujet*/

//package villagegauloisold;
//
//import personnages.Gaulois;
//import produit.IProduit;
//
//public class Etal <P extends IProduit> implements IEtal {
//	private Gaulois vendeur;
//	private P produit;
//	private int quantiteDebutMarche;
//	private int quantite;
//	private boolean etalOccupe = false;
//
//	@Override
//	public boolean isEtalOccupe() {
//		return etalOccupe;
//	}
//
//	@Override
//	public Gaulois getVendeur() {
//		return vendeur;
//	}
//
//	@Override
//	public int getQuantite() {
//		return quantite;
//	}
//
//	@Override
//	public P getProduit() {
//		return produit;
//	} 
//
//	@Override
//	public void occuperEtal(Gaulois vendeur, IProduit produit, int quantite) {
//		this.vendeur = vendeur;
//		this.produit = (P) produit;
//		this.quantite = quantite;
//		quantiteDebutMarche = quantite;
//		etalOccupe = true;
//	}
//
//	@Override
//	public boolean contientProduit(IProduit produit) {
//		return this.produit.equals(produit);
//	}
//
//	@Override
//	public int acheterProduit(int quantiteAcheter) {
//		if (quantite == 0) {
//			quantiteAcheter = 0;
//		}
//		if (quantiteAcheter > quantite) {
//			quantiteAcheter = quantite;
//		}
//		if (etalOccupe) {
//			quantite -= quantiteAcheter;
//		}
//		return quantiteAcheter;
//	}
//
//	@Override
//	public void libererEtal() {
//		etalOccupe = false;
//	}
//
//	/**
//	 * 
//	 * @param produit
//	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
//	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
//	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
//	 *         quantité de produit vendu
//	 */
//	@Override
//	public String[] etatEtal() {
//		String[] donneesVente = new String[5];
//		donneesVente[0] = String.valueOf(etalOccupe);
//		if (etalOccupe) {
//			donneesVente[1] = vendeur.getNom();
//			donneesVente[2] = produit.toString();
//			donneesVente[3] = String.valueOf(quantiteDebutMarche);
//			donneesVente[4] = String.valueOf(quantiteDebutMarche - quantite);
//		}
//		return donneesVente;
//	}
//
//}


/*------------------------------------------------------------------------------------------------------------------*/

/* CODE AVANT ESSAI 3*/

//package villagegaulois;
//
//import personnages.Gaulois;
//import produit.Produit;
//
//public class Etal <P extends Produit> {
//	private Gaulois vendeur;
//	private P produit;
//	private int quantiteDebutMarche;
//	private int quantite;
//	private boolean etalOccupe = false;
//
//	public boolean isEtalOccupe() {
//		return etalOccupe;
//	}
//
//	public Gaulois getVendeur() {
//		return vendeur;
//	}
//
//	public int getQuantite() {
//		return quantite;
//	}
//
//	public P getProduit() {
//		return produit;
//	}
//
//	public void occuperEtal(Gaulois vendeur, P produit, int quantite) {
//		this.vendeur = vendeur;
//		this.produit = produit;
//		this.quantite = quantite;
//		quantiteDebutMarche = quantite;
//		etalOccupe = true;
//	}
//
//	public boolean contientProduit(P produit) {
//		return this.produit.equals(produit);
//	}
//
//	public int acheterProduit(int quantiteAcheter) {
//		if (quantite == 0) {
//			quantiteAcheter = 0;
//		}
//		if (quantiteAcheter > quantite) {
//			quantiteAcheter = quantite;
//		}
//		if (etalOccupe) {
//			quantite -= quantiteAcheter;
//		}
//		return quantiteAcheter;
//	}
//
//	public void libererEtal() {
//		etalOccupe = false;
//	}
//
//	/**
//	 * 
//	 * @param produit
//	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
//	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
//	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
//	 *         quantité de produit vendu
//	 */
//	public String[] etatEtal() {
//		String[] donneesVente = new String[5];
//		donneesVente[0] = String.valueOf(etalOccupe);
//		if (etalOccupe) {
//			donneesVente[1] = vendeur.getNom();
//			donneesVente[2] = produit.toString();
//			donneesVente[3] = String.valueOf(quantiteDebutMarche);
//			donneesVente[4] = String.valueOf(quantiteDebutMarche - quantite);
//		}
//		return donneesVente;
//	}
//
//}
