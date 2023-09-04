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
	
	public String getFornavn(String fornavn) {
		return fornavn;
	}
	
	public void setFornavn() {
		this.fornavn = fornavn;
	}
	
	public String getEtternavn(String etternavn) {
		return etternavn;
	}
	
	public void setEtternavn() {
		this.etternavn = etternavn;
	}
	
	public Kjønn getKjonn(Kjønn kjønn) {
		return kjønn;
	}
	
	public void setKjønn() {
		this.kjønn = kjønn;
	}
	
	public String getStilling(String stilling) {
		
		return stilling;
	}
	public void setStilling() {
		this.stilling = stilling;
	}
	
	
	public int getAarslonn(int aarslonn) {
		return aarslonn;
	}
	
	public void setAarslonn() {
		this.aarslonn = aarslonn;
	}
	
	public String toString() {
		return fornavn + ", " + etternavn + ", " + kjønn + ", " + stilling + ", " + aarslonn; 
	}

}