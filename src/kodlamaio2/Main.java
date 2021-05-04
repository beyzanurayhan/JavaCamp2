package kodlamaio2;

public class Main {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setFirstName("Beyza Nur");
		student1.setLastName("Ayhan");
	
		Student student2 = new Student();
		student2.setFirstName("Taha");
		student2.setLastName("Ayhan");
		
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demirog");
		
		Instructor instructor2 = new Instructor();
		instructor2.setFirstName("Ali");
		instructor2.setLastName("Demir");


		
		UserManager userManager = new UserManager();
		User[] users = {student1, student2, instructor1, instructor2};
		userManager.addMultiple(users);
		
		
		
		
		
		
		
		
	}
	
}
