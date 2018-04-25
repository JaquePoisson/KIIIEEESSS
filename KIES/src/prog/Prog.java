package prog;

import data.Person;
import data.Student;

public class Prog {

	public static void main(String[] args) {
		new Prog();
	}
	
	public Prog() {
		Person p1 = new Person("Anna","Fischill",true);
		System.out.println(p1);
		
		Person p2 = new Person("Thomas","Kieswetter",false);
		System.out.println(p2);
		
		Student s1 = new Student("Paul","Fischill",false, 10);
		System.out.println(s1);
		
		for(Object p: Person.getPersonenListe()) {
			System.out.println(p);
			if(p instanceof Student) {
				Student s = (Student) p;
				System.out.println(s.getGrade());
			}
		}
	}
}
