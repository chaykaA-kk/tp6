package tp5;

public class Proprieteproff extends Propriete {
	
	public int nbemp;
	public boolean estEtatique;
	public Proprieteproff(int id, Personne responsable, String adresse, double surface,int nbemp,boolean estEtatique) {
		super(id, responsable, adresse, surface);
		this.nbemp=nbemp;
		this.estEtatique=estEtatique;
	}
	
	public int getNbemp() {
		return nbemp;
	}


	public boolean isEstEtatique() {
		return estEtatique;
	}

	@Override
	public String toString() {
		return super.toString()+"roprieteproPff [nbemp=" + nbemp + ", estEtatique=" + estEtatique + "]";
	}
	public double calcullmpot() {
		if (estEtatique=false) {
			return 100*(this.surface/100)+(30*nbemp);
		}
		else {
			return 0;
		}
	}
	
	

}
