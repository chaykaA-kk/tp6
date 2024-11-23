package tp5;

public class Lotissement implements Gestionprop {

		/*Propriete [] tab= new Propriete[4];
		tab[0]=new Propriete();*/
		protected Propriete[] tabProp;
		protected int nombre;
		
		public Lotissement(int capacité) {
			if (capacité<maxprop) {
				tabProp=new Propriete[capacité];
			}
		}
		public Propriete getproprieteByIndice (int i) {
				if((i>0)&&(i<nombre)) {
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
		public void affiche() {
			for(int i=0;i<nombre;i++) {
				System.out.println(tabProp[i].toString());
			}
		}
		public boolean ajoutprop(Propriete P) {
			if(nombre<maxprop) {
				tabProp[nombre]=P;
				nombre++;
			}
			else {
		
			}
			return false;
			
		}
		public boolean supprimer(Propriete P) {
			for(int i=0;i<nombre;i++) {
				if(tabProp[i].equals(P)) {
					for(int j=i;j<nombre;j++) {
						tabProp[j]=tabProp[j+1];
						return true;
					}
				}
			}
			return false;
		}
		
		

	
}

