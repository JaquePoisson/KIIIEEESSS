package data;

public class Student extends Person {

	private int grade = 0;
	
	public Student(String vorname, String nachname, boolean female, int grade) {
		super(vorname, nachname, female);
		this.grade = grade;
	}
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student " + super.toString() + " mit Note " + grade;
	}
}
