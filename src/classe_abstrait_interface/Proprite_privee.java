package classe_abstrait_interface;
public  class Proprite_privee extends Propriete{
	protected int nbpiece;

	public Proprite_privee(int id, Personne resposable, String adresse, double surface, int nbpiece) {
		super(id, resposable, adresse, surface);
		this.nbpiece = nbpiece;
	}

	public String toString() {
		return super.toString()+"nbpiece: "+nbpiece;
	}
	public  double calculImpot() {
		return 50/100*surface+10/nbpiece;
	}
}
