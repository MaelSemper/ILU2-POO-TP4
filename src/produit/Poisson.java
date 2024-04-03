package produit;

public class Poisson extends Produit{
	private String datePeche;
	
	public Poisson(Unit unit, String datePeche) {
		super("Poisson", unit);
		this.datePeche = datePeche;
	}
	
	public String description() {
		return "Poisson peche "+datePeche;
	}
}
