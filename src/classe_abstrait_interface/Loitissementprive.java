package classe_abstrait_interface;

public class Loitissementprive extends  Loitissement {
	  public Propriete getProprieteByIndex(int i) {
	        if (i>=0 &&i<nombre && tabProp[i] instanceof Proprite_privee ) {
	        	return tabProp[i];}
	       System.out.println("n existe pas");
	       return null;
	    }
	  public boolean ajouter(Propriete p) {
			if(nombre==MAX_PROPERTIES) {
				return false;
			}
			else if(p instanceof Proprite_privee) {
				tabProp[nombre]=p;
				nombre++;
				return true;
			}
			return false;

		}
		public  boolean supprimer(Propriete p) {
			if(nombre==0) {
				return false;
			}
			if(p instanceof Proprite_privee) {
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
			return false;
		
		}
}
