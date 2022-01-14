import tp1.education.tp.introduction.Salle;


public class AccesHorsPackage extends Salle {
	public void afficher(Salle s) {
		System.out.println(s.id );
		System.out.println(s.nom );
		System.out.println(id );
		System.out.println(nom);
	
	}
	 
	public static void main(String[] args) {
		
		Salle SalleB=new Salle();
		System.out.println(SalleB.id+" "+SalleB.nom );
		
	}

}
