package kodlamaio2;

public class Student extends User{
	
	private String studentNumber;
	private String cardNumber;
	
	public Student() {
		
	}
	public Student(int id, String email, String password, String firstName, String lastName, String studentNumber, String cardNumber) {
		super(id, email, password, firstName, lastName);
		this.studentNumber = studentNumber;
		this.cardNumber = cardNumber;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

}
