package oppg2;



public class Ansatt {

	String fornavn;
	String etternavn;
	Kjønn kjønn;
	String stilling;
	int aarslonn;
	
	public Ansatt(String fornavn, String etternavn, Kjønn kjønn, String stilling, int aarslonn) {
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.kjønn = kjønn;
		this.stilling = stilling;
		this.aarslonn = aarslonn;
	}
	
	public String getFornavn() {
		return fornavn;
	}
	
	
	
	public String getEtternavn() {
		return etternavn;
	}
	
	
	
	public Kjønn getKjonn() {
		return kjønn;
	}
	
	
	
	public String getStilling() {
		
		return stilling;
	}
	public void setStilling(String stilling) {
		this.stilling = stilling;
	}
	
	
	public int getAarslonn() {
		return aarslonn;
	}
	
	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}
	
	public String toString() {
		return fornavn + ", " + etternavn + ", " + kjønn + ", " + stilling + ", " + aarslonn; 
	}

}