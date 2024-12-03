package classe_abstrait_interface;

public class Loitissement implements Gestion_propriete {
	protected Propriete [] tabProp=new Propriete[MAX_PROPERTIES];
	protected int nombre=0;
	public int getNbpiece() {
		return 0;
	}
	public void afficherPropriétés() {
		if(nombre==0) {
			System.out.println("le tavbleau est vide");
		}
		else {
			for(int i=0;i<nombre;i++) {
				System.out.println(tabProp[i]);
			}
		}
	}
	  public Propriete getProprieteByIndex(int i) {
	        if (i>=0 &&i<nombre) {
	        	return tabProp[i];}
	       System.out.println("n existe pas");
	       return null;
	    }
	public boolean ajouter(Propriete p) {
		if(nombre==MAX_PROPERTIES) {
			return false;
		}
		tabProp[nombre]=p;
		nombre++;
		return true;
	}
	public  boolean supprimer(Propriete p) {
		if(nombre==0) {
			return false;
		}
		int i=0;
		while(i<nombre && p.id!=tabProp[i].id) {
			i++;
		}
		for(int j=i;j<nombre;j++) {
			tabProp[j]=tabProp[j+1];
		}
		nombre--;
		return true;
	}
	
}
