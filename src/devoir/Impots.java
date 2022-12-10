package devoir;

import java.util.ArrayList;
import java.util.List;

public class Impots {
	protected int annee;
	protected double totalImpot;
	protected List<Dossier> dossiers;
	
	public Impots(int annee) {
		this.annee = annee;
		this.dossiers = new ArrayList<>();
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public double getTotalImpot() {
		return totalImpot;
	}

	public void setTotalImpot(double totalImpot) {
		this.totalImpot = totalImpot;
	}
	
	public void add(Dossier dossier) {
		this.dossiers.add(dossier);
		this.totalImpot += dossier.getMontant();
	}
	
	@Override
	public String toString() {
		String result = "Liste des impots : "+ this.annee +"\n ";
		for (Dossier dossier : this.dossiers) {
			result += dossier.toString();
		}
		
		result += "Total :" + this.totalImpot;
		return result;
	}
	
	

}
