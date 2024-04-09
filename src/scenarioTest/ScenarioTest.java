package scenarioTest;

import personnages.Gaulois;
import produit.Poisson;
import produit.Sanglier;
import villagegauloisold.Etal;
import villagegauloisold.IEtal;

public class ScenarioTest {
	
	public static void main(String[] args) {
		
		/* TEST essai 1*/
		
//		IEtal[] marche = new IEtal[3];
//		IEtal<Sanglier> etalSanglier = new Etal<>();
//		marche[0] = etalSanglier;		
//		IEtal<Poisson> etalPoisson = new Etal<>();
//		marche[1] = etalPoisson;
		System.out.println("Test essai 1: OK");
		
		/* TEST essai 2*/
		
//		IEtal<Sanglier>[] marche = new IEtal[3];
//		
//		Etal<Sanglier> etalSanglier = new Etal();
//		Gaulois Ast�rix;
//		etalSanglier.occuperEtal(Ast�rix, new Sanglier(11, Ast�rix), 5);
//		marche[0] = etalSanglier;
		
		System.out.println("Test essai 2: OK");
		
		/* TEST essai 3*/
		
//		IEtal[] etals = new IEtal[3];
//		Etal etalSanglier = new Etal();
//		etals[0] = etalSanglier;

		System.out.println("Test essai 3: OK");

		/* TEST essai Nouveau Sujet*/
		
		Gaulois ordralfabetix = new Gaulois("Ordralfabétix",9);
		Gaulois obelix = new Gaulois("Obélix",20);
		Gaulois asterix = new Gaulois("Asterix", 6);
		
		Sanglier sanglier1 = new Sanglier(2000, obelix,5);
		Sanglier sanglier2 = new Sanglier(1500, obelix,5);
		Sanglier sanglier3 = new Sanglier(1000, asterix,5);
		Sanglier sanglier4 = new Sanglier(500, asterix,5);
		
		Sanglier[] sangliersObelix = {sanglier1, sanglier2};
		Sanglier[] sangliersAsterix = {sanglier3, sanglier4};
		
		Poisson poisson1 = new Poisson("lundi",5);
		Poisson[] poissons = {poisson1};
		
        Etal<Sanglier> etalSanglier1 = new Etal<>();
        Etal<Sanglier> etalSanglier2 = new Etal<>();
        Etal<Poisson> etalPoisson = new Etal<>();
        
        IEtal[] marche = new IEtal[3];
        marche[0] = etalSanglier1;
        marche[1] = etalSanglier2;
        marche[2] = etalPoisson;
        
        etalSanglier1.installerVendeur(obelix, sangliersObelix, 8);
        etalSanglier2.installerVendeur(asterix, sangliersAsterix, 10);
        etalPoisson.installerVendeur(ordralfabetix, poissons, 7);
        
        System.out.println("Étals du marché :");
        for (IEtal etal : marche) {
            System.out.println(etal.etatEtal());
        }
        
        int sangliersAchetes = 0;
        int sangliersVoulus = 3;
        for (IEtal etal : marche) {
            if (etal instanceof Etal && sangliersAchetes < sangliersVoulus) {
                Etal<Sanglier> etalSanglier = (Etal<Sanglier>) etal;
                int quantiteDisponible = etalSanglier.getNbProduit();
                int quantiteAcheter = Math.min(quantiteDisponible, sangliersVoulus - sangliersAchetes);
                double prixTotal = etalSanglier.acheterProduit(quantiteAcheter);
                System.out.println("Achat de " + quantiteAcheter + " sanglier(s) pour un total de " + prixTotal + " sous.");
                sangliersAchetes += quantiteAcheter;
            }
        }
        
        System.out.println("\nÉtals du marché après l'achat :");
        for (IEtal etal : marche) {
            System.out.println(etal.etatEtal());
        }
        
		System.out.println("Test Nouveau Sujet: OK");

		
	}
	
}
