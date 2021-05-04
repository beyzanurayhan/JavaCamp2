package kodlamaioagain;


public class UserManager {
	
	public void register(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " kay�t olundu.");
	}
	
	public void login(User user) {
		System.out.println("Giri� Ba�ar�l�" + user.getFirstName() + " " + user.getLastName());
	}
	
	public void logOut(User user) {
		System.out.println("��k�� Ba�ar�l�" + user.getFirstName() + " " + user.getLastName());
	}
	
	public void addMultiple(User[] users) {
		for(User user : users) {
			register(user);
		}
		
	}

}
