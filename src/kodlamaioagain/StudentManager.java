package kodlamaioagain;

public class StudentManager extends UserManager {
	
	public void chooseCourse() {
		System.out.println("Kurs se�ildi.");
	}
	
	public void adCart(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "Kart bilgileriniz ba�ar�yla eklendi.");
	}
	
	public void pay(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "�deme yap�ld�.");
	}
	

}
