package devoir;

public class DossierRevenus extends Dossier{
	
	private double ca;

	public DossierRevenus(int id, double ca) {
		super(id);
		this.ca = ca;
		this.calculerMontant();
	}
	public double getCa() {
		return ca;
	}

	public void setCa(double ca) {
		this.ca = ca;
	}

	@Override
	void calculerMontant() {
		
		super.montant = this.ca * 15/100;
		
	}
	
	@Override
	public String toString() {
		return "15% de revenus " + this.ca + ", Montant : " + super.montant +"\n";
	}
	
	

}
