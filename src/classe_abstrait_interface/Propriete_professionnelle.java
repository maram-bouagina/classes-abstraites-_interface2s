package classe_abstrait_interface;
public   class Propriete_professionnelle extends Propriete {
				private boolean estEtatique;
				private int nbEmploye;
				public Propriete_professionnelle(int id, Personne resposable, String adresse, double surface,
						boolean estEtatique, int nbEmploye) {
					super(id, resposable, adresse, surface);
					this.estEtatique = estEtatique;
					this.nbEmploye = nbEmploye;
				}
				public boolean isEstEtatique() {
					return estEtatique;
				}
				public void setEstEtatique(boolean estEtatique) {
					this.estEtatique = estEtatique;
				}
				public int getNbEmploye() {
					return nbEmploye;
				}
				public void setNbEmploye(int nbEmploye) {
					this.nbEmploye = nbEmploye;
				}@Override
				public String toString() {
					return super.toString()+"nbEmploye: "+nbEmploye+"estEtatique"+estEtatique;
				}
				double calculImpot() {
					if(estEtatique) {
						
						 return (100.0 / 100) *surface+30.0*nbEmploye;
					}
					return 0;
				
				}
}
