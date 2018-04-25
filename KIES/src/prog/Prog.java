package prog;

import data.Person;

public class Prog {

	public static void main(String[] args) {
		new Prog();
	}
	
	public Prog() {
		Person p1 = new Person();
		p1.setVorname("Anna");
		p1.setNachname("Fischill");
		p1.setFemale(true);
		System.out.println(p1);
	}
}
