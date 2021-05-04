package kodlamaio2;

public class Instructor extends User{
	
	private int instructorNumber;
	private String branch;
	
	public Instructor() {
		
	}
	public Instructor(int id,String email, String password, String firstName, String lastName, int instructorNumber, String branch) {
		super(id, email, password, firstName, lastName);
		this.instructorNumber = instructorNumber;
		this.branch = branch;
	}

	public int getInstructorNumber() {
		return instructorNumber;
	}
	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
