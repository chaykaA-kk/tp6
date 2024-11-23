package tp5;

public class appartement extends Proprirteprivee{
	public int numetage;
	public appartement(int id, Personne responsable, String adresse, double surface, int nbpiece,int numetage) {
		super(id, responsable, adresse, surface, nbpiece);
		this.numetage=numetage;
	}
	@Override
	public String toString() {
		return super.toString()+"appartement [numetage=" + numetage + "]";
	}
	
	

}
