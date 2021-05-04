package kodlamaioagain;

public class Student extends User{
	
	private String studentNumber;
	private String cardNumber;
	
	public Student() {
		
	}
	public Student(String studentNumber, String cardNumber) {
		super();
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
