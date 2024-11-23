package tp5;

public class Fiscalite {

	public static void main(String[] args) {
		Personne p1=new Personne(1,"chaima", "khemiri");
        Personne p2=new Personne(2, "ryhem", "dakhlaoui");
        Personne p3=new Personne(3, "rahma", "benhsin");
        Lotissement lotissement = new Lotissement(10);
        /*lotissement[0] = new Proprirteprivee(1, p1, "Corniche", 350, 4);
        lotissement[1] = new Villa(2, p2, "Dar Chaabane", 400, 6, true);
        lotissement[2] = new appartement(3, p2, "Hammamet", 1200, 8, 3);
        lotissement[3] = new Proprieteproff(4, p3, "Korba", 1000, 50, true);
        lotissement[3] = new Proprieteproff(5,p1,"Bir Bouragba",2500, 400, false); */
        lotissement.ajoutprop(new Proprirteprivee(1, p1, "Corniche", 350, 4));
        lotissement.ajoutprop(new Villa(2, p2, "Dar Chaabane", 400, 6, true));
        lotissement.ajoutprop(new appartement(3, p2, "Hammamet", 1200, 8, 3));
        lotissement.ajoutprop(new Proprieteproff(4, p3, "Korba", 1000, 50, true));
        lotissement.ajoutprop(new Proprieteproff(5, p1, "Bir Bouragba", 2500, 400, false));
        lotissement.affiche();
        System.out.println("les nombres piece:"+lotissement.getnbPièces());
        
        Propriete p=new appartement(3, p2, "Hammamet", 1200, 8, 3);
        lotissement.supprimer(p);
        System.out.println("apres suppréssion:");
        lotissement.affiche();
        
        
     
        



		

	}

}
