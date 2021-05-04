package kodlamaioagain;

public class StudentManager extends UserManager {
	
	public void chooseCourse() {
		System.out.println("Kurs seçildi.");
	}
	
	public void adCart(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "Kart bilgileriniz baþarýyla eklendi.");
	}
	
	public void pay(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + "Ödeme yapýldý.");
	}
	

}
