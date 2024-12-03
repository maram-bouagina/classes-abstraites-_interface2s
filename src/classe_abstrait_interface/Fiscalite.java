package classe_abstrait_interface;

public class Fiscalite {
	public static void main(String[] args) {
		Personne p1=new Personne(123,"bouagina","maram");
		Personne p2=new Personne(456,"bouagina","youssef");
		Personne p3=new Personne(789,"souissi","chayma");
		Loitissement l=new Loitissement();
		Propriete ppriv=new Proprite_privee(1,p1,"Corniche",350,4);
		Propriete Villa=new Villa(2,p2,"Dar chaaban",400,6,true);
		Propriete appartement=new Appartement(3,p2,"hammemet",1200,8,3);
		Propriete pprof1=new Propriete_professionnelle (4,p3,"Korba", 1000,true,50);
		Propriete pprof2=new Propriete_professionnelle (5,p1,"Bir Bouragba",2500,false,400);
		System.out.println("avant supression");
		System.out.println("");
		l.ajouter(ppriv);
		l.ajouter(Villa);
		l.ajouter(appartement);
		l.ajouter(pprof1);
		l.ajouter(pprof2);
		l.afficherPropriétés();
		System.out.println();
		l.supprimer(appartement);
		System.out.println("apres supression");
		System.out.println("");
		l.afficherPropriétés();
		int nbpiecesTotal=0;
		for(int i=0;i<l.nombre;i++) {
			if(l.getProprieteByIndex(i) instanceof Proprite_privee) {
				Proprite_privee propPrivee=(Proprite_privee) l.getProprieteByIndex(i);
				nbpiecesTotal+= propPrivee.nbpiece;
			}
		}
		System.out.println("");
		System.out.println("le nombre des pieces total est: "+nbpiecesTotal);

		int i=0;
		while(i<l.nombre && !(l.getProprieteByIndex(i) instanceof Proprite_privee)) {
				i++;
			}
		Proprite_privee propPrivee=(Proprite_privee) l.getProprieteByIndex(i);
		double impotmin=propPrivee.calculImpot();
		for(int j=i;j<l.nombre;j++) {
			if(l.getProprieteByIndex(i) instanceof Proprite_privee){
					propPrivee=(Proprite_privee) l.getProprieteByIndex(i);
					if(impotmin>propPrivee.calculImpot()) {
						impotmin=propPrivee.calculImpot();
					}
			}
		}
		System.out.println("");
		System.out.println("Impot min: "+ impotmin);
		
		Loitissement lp= new Loitissementprive();
		System.out.println("avant supression");
		System.out.println("");
		lp.ajouter(ppriv);
		lp.ajouter(Villa);
		lp.ajouter(appartement);
		lp.ajouter(pprof1);
		lp.ajouter(pprof2);
		lp.afficherPropriétés();
		lp.supprimer(appartement);
		System.out.println("apres supression");
		System.out.println("");
		lp.afficherPropriétés();
		System.out.println("");
		System.out.println("getproprité par indice: "+lp.getProprieteByIndex(1));
		

}
}
