package kodlamaio2;

public class StudentManager extends UserManager {
	
	public void chooseCourse() {
		System.out.println("Kurs se�ildi.");
	}
	
	public void adCart(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + "Kart bilgileriniz ba�ar�yla eklendi.");
	}
	
	public void pay(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + "�deme yap�ld�.");
	}
	

}
