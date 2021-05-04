package kodlamaioagain;

public class Instructor extends User{
	
	private int instructorNumber;
	private String branch;
	
	public Instructor() {
		
	}
	public Instructor(int instructorNumber, String branch) {
		super();
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
