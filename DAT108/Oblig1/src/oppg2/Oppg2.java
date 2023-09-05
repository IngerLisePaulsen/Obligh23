package oppg2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


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
        
        System.out.println("Opprinnelige lønninger:");
        skrivUtAlle(ansatte);
        System.out.println();

        System.out.println("\nEtter fast prosenttillegg:");
        lonnsoppgjor(ansatte, fastProsentTillegg(5)); // Legg til 5% prosenttillegg
        skrivUtAlle(ansatte);
        System.out.println();
        
        System.out.println("\nEtter fast prosenttillegg:");
        lonnsoppgjor(ansatte, fastProsentTillegg(5)); // Legg til 5% prosenttillegg
        skrivUtAlle(ansatte);
        System.out.println();

        System.out.println("\nEtter fast kronetillegg for lav lønn:");
        lonnsoppgjor(ansatte, fastKroneTilleggLavLonn(50000)); // Legg til 50000 kroner til ansatte med lønn under 600000
        skrivUtAlle(ansatte);
        System.out.println();

        lonnsoppgjor(ansatte, fastProsentTilleggMann(10)); // Legg til 10% prosenttillegg for mannlige ansatte
        System.out.println("\nEtter fast prosenttillegg for mannlige ansatte:");
        skrivUtAlle(ansatte);
        System.out.println();
    }
    
    private static void lonnsoppgjor(List<Ansatt> ansatte, Function<Ansatt, Void> nylonn) {
        for (Ansatt ansatt : ansatte) {
            nylonn.apply(ansatt);
        }
    }
    
    private static void skrivUtAlle(List<Ansatt> ansatte) {
        for (Ansatt nyAnsatt : ansatte) {
            System.out.println(nyAnsatt);
        }
    }

    public static Function<Ansatt, Void> fastProsentTillegg(int prosent) {
        return ansatt -> {
            int nyLonn = (int) (ansatt.getAarslonn() * (1.0 + (prosent / 100.0)));
            ansatt.setAarslonn(nyLonn);
            return null;
        };
    }

    public static Function<Ansatt, Void> fastKroneTilleggLavLonn(int tillegg) {
        return ansatt -> {
            if (ansatt.getAarslonn() < 400000) {
                ansatt.setAarslonn(ansatt.getAarslonn() + tillegg);
            }
            return null;
        };
    }

    public static Function<Ansatt, Void> fastProsentTilleggMann(int prosent) {
        return ansatt -> {
            if (ansatt.getKjonn() == Kjønn.MANN) {
                int nyLonn = (int) (ansatt.getAarslonn() * (1.0 + (prosent / 100.0)));
                ansatt.setAarslonn(nyLonn);
            }
            return null;
        };
    }
}
	


