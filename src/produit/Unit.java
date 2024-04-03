package produit;

public enum Unit {
	LITRE("L"),
	GRAMME("g"),
	KILOGRAMME("Kg"),
	CENTILITRE("cl"),
	MILILITRE("ml"),
	PIECE("pcs");
	
	private String abreviation;
	
	private Unit(String abreviation) {
		this.abreviation = abreviation;
	}
	
	public String getAbreviation() {
		return abreviation;
	}
}
