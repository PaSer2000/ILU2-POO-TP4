package scenarioTest;

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
//		Gaulois Astérix;
//		etalSanglier.occuperEtal(Astérix, new Sanglier(11, Astérix), 5);
//		marche[0] = etalSanglier;
		
		System.out.println("Test essai 2: OK");
		
		/* TEST essai 3*/
		
		IEtal[] etals = new IEtal[3];
		Etal etalSanglier = new Etal();
		etals[0] = etalSanglier;

		System.out.println("Test essai 3: OK");

	}
	
}
