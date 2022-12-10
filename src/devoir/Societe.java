package devoir;
import java.util.ArrayList;
import java.util.List;

public class Societe {
	private long id;
	private String raison_sociale;
	private List<Impots> impots;

	public Societe(long id, String raison_sociale) {
		this.id = id;
		this.raison_sociale = raison_sociale;
		this.impots = new ArrayList<>();
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRaison_sociale() {
		return raison_sociale;
	}
	public void setRaision_sociale(String raison_sociale) {
		this.raison_sociale = raison_sociale;
	}
	
	public void add(Impots impot) {
		this.impots.add(impot);
	}
	@Override
	public String toString() {
		return "Scoiété : "+ this.id +" - "+ this.raison_sociale;
	}
	public Impots getImpots(int annee) {
		for (Impots impot : this.impots) {
			if(impot.annee == annee) {
				return impot;
			}
		}
		return null;
	}
}
