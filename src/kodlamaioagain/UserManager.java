package kodlamaioagain;


public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kayýt olundu.");
	}
	
	public void login(User user) {
		System.out.println("Giriþ Baþarýlý" + user.getFirstName() + " " + user.getLastName());
	}
	
	public void logOut(User user) {
		System.out.println("Çýkýþ Baþarýlý" + user.getFirstName() + " " + user.getLastName());
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			register(user);
		}
		
	}

}
