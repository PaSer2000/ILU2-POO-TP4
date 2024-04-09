package villagegauloisold;

import personnages.Gaulois;

public interface IEtal {
	Gaulois getVendeur();
	double donnerPrix();
	int contientProduit(String produit, int quantiteSouhaitee);
	double acheterProduit(int quantiteSouhaitee);
	String etatEtal();
	int getNbProduit();
	
}

/*------------------------------------------------------------------------------------------------------------------*/

/* CODE AVANT Nouveau Sujet*/

//package villagegauloisold;
//
//import personnages.Gaulois;
//import produit.IProduit;
//
//public interface IEtal {
//
//	boolean isEtalOccupe();
//
//	Gaulois getVendeur();
//
//	int getQuantite();
//
//	IProduit getProduit();
//
//	void occuperEtal(Gaulois vendeur, IProduit produit, int quantite);
//
//	boolean contientProduit(IProduit produit);
//
//	int acheterProduit(int quantiteAcheter);
//
//	void libererEtal();
//
//	/**
//	 * 
//	 * @param produit
//	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
//	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
//	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
//	 *         quantité de produit vendu
//	 */
//	String[] etatEtal();
//
//}

/*------------------------------------------------------------------------------------------------------------------*/

/* CODE AVANT ESSAI 3*/

//package villagegaulois;
//
//import personnages.Gaulois;
//import produit.Produit;
//
//public interface IEtal<P extends Produit> {
//
//	boolean isEtalOccupe();
//
//	Gaulois getVendeur();
//
//	int getQuantite();
//
//	P getProduit();
//
//	void occuperEtal(Gaulois vendeur, P produit, int quantite);
//
//	boolean contientProduit(P produit);
//
//	int acheterProduit(int quantiteAcheter);
//
//	void libererEtal();
//
//	/**
//	 * 
//	 * @param produit
//	 * @return donneesVente est un tableau de chaine contenant [0] : un boolean
//	 *         indiquant si l'étal est occupé [1] : nom du vendeur [2] : produit
//	 *         vendu [2] : quantité de produit à vendre au début du marché [4] :
//	 *         quantité de produit vendu
//	 */
//	String[] etatEtal();
//
//}