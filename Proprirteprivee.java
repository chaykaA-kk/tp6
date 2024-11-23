package tp5;

public  class Proprirteprivee extends Propriete{
	
	private int nbpiece;
	public Proprirteprivee(int id, Personne responsable, String adresse, double surface,int nbpiece) {
		super(id, responsable, adresse, surface);
		this.nbpiece=nbpiece;
}
	public int getNbpiece() {
		return nbpiece;
	}
	

	public void setNbpiece(int nbpiece) {
		this.nbpiece = nbpiece;
	}
	@Override
	public String toString() {
		return super.toString()+"Proprirteprivee [nbpiece=" + nbpiece + "]";
	}
	public double calcullmpot() {
		return 50*(surface/100)+(10*nbpiece);
	}
}
