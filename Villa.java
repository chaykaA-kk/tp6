package tp5;

public class Villa extends Proprirteprivee{
	public boolean avecpicine;
	public Villa(int id, Personne responsable, String adresse, double surface, int nbpiece,boolean avecpicine) {
		super(id, responsable, adresse, surface, nbpiece);
		this.avecpicine=avecpicine;
	}
	public String toString() {
		return super.toString()+"Villa [avecpicine=" + avecpicine + "]";
	
	}
	public double calcullmpot() {
		if(avecpicine) {
			return super.calcullmpot()+200;
		}
		else{
			return super.calcullmpot();
		}
	}
	
	

}
