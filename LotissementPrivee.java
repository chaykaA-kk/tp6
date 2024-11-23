package tp5;

public class LotissementPrivee extends Lotissement {
	public int capacite;
	
	
	public LotissementPrivee(int capacite) {
		super(capacite);
		
	}
	
	public boolean ajoutprop(Propriete P) {
		if(P instanceof Proprirteprivee) {
			return super.ajouter(P);
		}
		else {
	
		}
		System.out.println("only propriete privee!!");
		return false;
		
	}
	public Propriete getproprieteByIndice (int i) {
		if((i>0)&&(i<nombre)&& tabProp[i] instanceof Proprirteprivee ) {
			return tabProp[i];
		}
		else {
			return null;
		}
}
	public int getnbPièces() {
		int n=0;
		for(int j=0;j<nombre;j++) {
			if(tabProp[j] instanceof Proprirteprivee) {
				  n+=((Proprirteprivee)tabProp[j]).getNbpiece();
			}
		}
		return n;
	}

}
