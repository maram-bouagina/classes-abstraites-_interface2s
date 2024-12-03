package classe_abstrait_interface;
public abstract class Propriete {
	  protected int id;
	  protected Personne resposable;
	  protected String adresse;
	  protected double surface;
	public Propriete(int id, Personne resposable, String adresse, double surface) {
		this.id = id;
		this.resposable = resposable;
		this.adresse = adresse;
		this.surface = surface;
	}
	@Override
	public String toString() {
		return "id=" + id + ", resposable=" + resposable + ", adresse=" + adresse + ", surface=" + surface;
	}
	abstract double calculImpot();
	
	
	  
}
