package produit;

public abstract class Produit {
	private String nom;
	protected Unit unit;
	
	public Produit(String nom, Unit unit) {
		this.nom = nom;
		this.unit = unit;
	}
	
	public String getNom() {
		return nom;
	}
	
	public abstract String description();
	
}
