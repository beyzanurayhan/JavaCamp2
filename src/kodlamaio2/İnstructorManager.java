package kodlamaio2;

public class �nstructorManager extends UserManager{
	
	public void addBranch(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getBranch() + "eklendi.");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +  "ba�ar�yla eklendi.");
	}
}
