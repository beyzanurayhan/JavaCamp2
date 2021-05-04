package kodlamaio2;

public class StudentManager extends UserManager {
	
	public void chooseCourse() {
		System.out.println("Kurs seçildi.");
	}
	
	public void adCart(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + "Kart bilgileriniz başarıyla eklendi.");
	}
	
	public void pay(Student student) {
		System.out.println(student.getFirstName() + " " + student.getLastName() + "Ödeme yapıldı.");
	}
	

}
