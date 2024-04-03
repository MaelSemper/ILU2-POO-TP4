package scenarioTest;

import villagegaulois.Etal;
import villagegaulois.IEtals;
public class ScenarioTest {
	public static void main(String[] args) {
		IEtals[] marche = new IEtals[3];
		IEtals<Sanglier> etalSanglier = new Etal<>();
		IEtals<Poisson> etalPoisson = new Etal<>();
		marche[0] = etalSanglier;
		marche[1] = etalPoisson;
		System.out.println("Fin test");
	}
}
