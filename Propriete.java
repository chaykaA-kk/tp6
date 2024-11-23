package tp5;

import java.util.Objects;

abstract class Propriete {
	protected int id ;
	protected Personne responsable;
	protected String adresse;
	protected double surface ;
	
	public Propriete(int id ,Personne responsable,String adresse,double surface) {
		this.id=id;
		this.responsable=responsable;
		this.adresse=adresse;
		this.surface=surface;
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Propriete [id=" + id + ", responsable=" + responsable + ", adresse=" + adresse + ", surface=" + surface
				+ "]";
	}
	abstract double calcullmpot() ;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propriete other = (Propriete) obj;
		return id == other.id;
	}
	
}
