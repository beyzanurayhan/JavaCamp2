package kodlamaioagain;

public class �nstructorManager extends UserManager{
	public void addBranch(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getBranch() + "eklendi.");
	}
	
	public void addCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "ba�ar�yla eklendi.");
	}
}
