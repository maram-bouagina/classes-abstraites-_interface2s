package classe_abstrait_interface;
public  class Appartement extends Proprite_privee {
		private int numEtage;


		public Appartement(int id, Personne resposable, String adresse, double surface, int nbpiece, int numEtage) {
			super(id, resposable, adresse, surface, nbpiece);
			this.numEtage = numEtage;
		}

		public int getNumEtage() {
			return numEtage;
		}

		public void setNumEtage(int numEtage) {
			this.numEtage = numEtage;
		}
		@Override
		public String toString() {
			return super.toString()+"numEtage: "+numEtage;
		}
		
		
		
}
