package devoir;

abstract class Dossier {
	protected int id;
	protected double montant;
	
	public Dossier(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	abstract void calculerMontant();
	
}
