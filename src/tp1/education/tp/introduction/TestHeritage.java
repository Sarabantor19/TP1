package tp1.education.tp.introduction;

public class TestHeritage {

	public static void main(String[] args) {
	
		Salle s1=new SalleCours(1, "Salle 1", 20);
		SalleCours s2= new SalleCours(2, "Salle 2", 20);
		//  On peut pas declatrer un objet de class fille et le mettre dans la class mere 
		SalleCours s3= (SalleCours)s1;
		SalleCours s4=s2;
		
		Salle s5=new Laboratoire(2, "LABO", "CHIMIE");
		SalleCours s6= new SalleCours(2, "Salle 2", 20);
		//SalleCours s7=s5;
		SalleCours s8=s6;

	}

}
