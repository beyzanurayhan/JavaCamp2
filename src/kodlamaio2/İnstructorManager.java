package kodlamaio2;

public class ÝnstructorManager extends UserManager{
	
	public void addBranch(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " " + instructor.getBranch() + "eklendi.");
	}
	
	public void addCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() +  "baþarýyla eklendi.");
	}
}
