
public class StudentInfo {
	
	private int StudentId;
	private String lastName;
	private String firstName;
	private String phoneNumber;
	private String emailAddress;
	
	
	public StudentInfo() {
		this(0, "", "", "", "");
	}

	public StudentInfo(int studentId, String lastName, String firstName, String phoneNumber, String emailAddress) {
		super();
		StudentId = studentId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	@Override
	public String toString() {
		return "StudentInfo [StudentId=" + StudentId + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", phoneNumber=" + phoneNumber + ", emailAddress=" + emailAddress + "]";
	}
	
	
	
}
