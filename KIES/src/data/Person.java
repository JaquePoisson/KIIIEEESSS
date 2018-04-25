package data;

public class Person {
	private String vorname;
	private String nachname;
	private boolean female;
	
	@Override
	public String toString() {
		return (isFemale() ? "Frau" : "Mann") + " " + getVorname() + " " + getNachname();
	}
	
	public boolean isFemale() {
		return female;
	}
	
	public void setFemale(boolean female) {
		this.female = female;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
}
