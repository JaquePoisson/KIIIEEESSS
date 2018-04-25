package data;

import java.util.ArrayList;

public class Person {
	
	private static ArrayList<Person> personenListe = new ArrayList<Person>();
	
	
	private String vorname = null;
	private String nachname = null;
	private boolean female = false;
	
	
	
	public Person(String vorname, String nachname, boolean female) {
		super();
		this.vorname = vorname;
		this.nachname = nachname;
		this.female = female;
		personenListe.add(this);
	}

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
	
	public static ArrayList<Person> getPersonenListe() {
		return personenListe;
	}

	public static void setPersonenListe(ArrayList<Person> personenListe) {
		Person.personenListe = personenListe;
	}

	
}
