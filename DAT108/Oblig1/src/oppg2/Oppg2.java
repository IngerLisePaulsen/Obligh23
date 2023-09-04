package oppg2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.*;





public class Oppg2 {
	
	
	
	
	
	
	public static void main(String[] args) {
	Ansatt Ansatt1 = new Ansatt("Rudolf","Olsen", Kjønn.MANN, "Sjef",550000);
	Ansatt Ansatt2 = new Ansatt("Sigrid", "Danielsen", Kjønn.KVINNE, "Sekretær",900000);
	Ansatt Ansatt3 = new Ansatt("Didrik", "Solheim", Kjønn.MANN, "Vaskemann",1000000);	
	Ansatt Ansatt4 = new Ansatt("Vigdis", "Hole", Kjønn.KVINNE, "HR",600000);
	Ansatt Ansatt5 = new Ansatt("Tom", "Tomsen", Kjønn.MANN, "IT hjelp",670000);	
	
	
	
	List<Ansatt> ansatte = new ArrayList <Ansatt> ();
	ansatte.add(Ansatt1);
	ansatte.add(Ansatt2);
	ansatte.add(Ansatt3);
	ansatte.add(Ansatt4);
	ansatte.add(Ansatt5);
	
	System.out.println(ansatte);
	skrivUtAlle(ansatte);
		
	}


	private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt,Integer> nylonn) {
		//ansatt.setlonn
		
	
	}
	public static Function<Integer, Integer> fastKroneTillegg(int tillegg) {
			return a -> a + tillegg; 
			
	}	
	private static void skrivUtAlle(List<Ansatt> ansatte) {
		for (Ansatt nyAnsatt : ansatte) {
			System.out.print(ansatte);
		}
		
	}
		
		
		
}

