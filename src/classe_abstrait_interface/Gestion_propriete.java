package classe_abstrait_interface;

public interface Gestion_propriete {
	final static int MAX_PROPERTIES=10;
	abstract void afficherPropriétés();
	abstract boolean ajouter(Propriete p);
	abstract boolean supprimer(Propriete p);
	
}
