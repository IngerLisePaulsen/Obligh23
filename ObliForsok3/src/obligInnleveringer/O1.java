package obligInnleveringer;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O1 {
	public static void main(String[] args) {
		double brutto = parseInt(showInputDialog("Brutto: "));
		
		//Maksbeløp per trinn
		double trinn0 = 190349.0;
		double trinn1 = 267899.0;
		double trinn2 = 643799.0;
		double trinn3 = 969199.0;
		double trinn4 = 1999999.0;
		double trinn5 = 2000000.0;
		
		//Utregning skatt pr trinn
		double sats1 = (trinn1 - trinn0) * 0.017;
		double sats2 = (trinn2 - trinn1) * 0.04;
		double sats3 = (trinn3 - trinn2) * 0.134;
		double sats4 = (trinn4 - trinn3) * 0.164;
	
		
		if (brutto <= trinn0) {
			System.out.println("Ikke skatt");
		}
		else {
			if((brutto > trinn0) && (brutto <=trinn1)) {
				double skatt1 = (brutto - trinn0) * 0.017;
				System.out.println("Skatt trinn 1 å betale " + skatt1);
			    }
			else {
				if((brutto > trinn1) && (brutto <=trinn2)) {
				double skatt2 = (brutto - trinn1) * 0.04 + sats1;
				System.out.println("Skatt trinn 2 å betale " + skatt2);
				}
			else {
				if((brutto > trinn2) && (brutto <=trinn3)) {
				double skatt3 = (brutto - trinn2) * 0.134 + sats1 + sats2;
				System.out.println("Skatt trinn 3 å betale " + skatt3);
				}
			else {
				if((brutto > trinn3) && (brutto <=trinn4)) {
				double skatt4 = (brutto - trinn3) * 0.164 + sats1 + sats2;
				System.out.println("Skatt trinn 4 å betale " + skatt4);
				}
			else {
				if(brutto > trinn4) {
				double skatt5 = (brutto - trinn4) * 0.174 + sats1 + sats2 + sats3 + sats4;
				System.out.println("Skatt trinn 5 å betale " + skatt5);
				}
				
			 }
					
			}
			}
			}
			
		}
		
	}
}



