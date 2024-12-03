package classe_abstrait_interface;
public  class Villa extends Proprite_privee {
	private boolean avecPiscine;
	public Villa(int id, Personne resposable, String adresse, double surface, int nbpiece, boolean avecPiscine) {
		super(id, resposable, adresse, surface, nbpiece);
		this.avecPiscine = avecPiscine;
	}
	public boolean getAvecPiscine() {
		return avecPiscine;
	}
	public void setAvecPiscine(boolean avecPiscine) {
		this.avecPiscine = avecPiscine;
	}
	@Override
	public double calculImpot() {
	    double p=(50.0/100)*surface +10.0*nbpiece; 
	    if (avecPiscine) {
	        p+=200;
	    }
	    return p;
	}
	public String toString() {
		return super.toString()+"avecPiscine: "+avecPiscine;
	}
}
