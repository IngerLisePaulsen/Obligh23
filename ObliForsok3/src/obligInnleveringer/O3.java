package obligInnleveringer;

	
	import static java.lang.Integer.parseInt;
	import static javax.swing.JOptionPane.showInputDialog;

	public class O3 {


		public static void main(String[] args) {
			int a = 1;
			int n = parseInt(showInputDialog("Skriv heltall: "));
			
			
			while (n>0) {
	       
			a = n * a; //a*= n (forenklet versjon)
			n--;
				
			} System.out.println(a);
			}
	}
		