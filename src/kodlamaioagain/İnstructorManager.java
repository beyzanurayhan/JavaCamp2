package kodlamaioagain;

public class İnstructorManager extends UserManager{
	public void addBranch(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getBranch() + "eklendi.");
	}
	
	public void addCourse(User user) {
		System.out.println(user.getFirstName() + " " + user.getLastName() +  "başarıyla eklendi.");
	}
}
