package homework;

public class Student extends User {

	String studentCode;
	String[] coursesTaken;
	
	public Student() {
		
	}
	
	public Student(String studentCode, String[] coursesTaken) {
		super();
		this.studentCode = studentCode;
		this.coursesTaken = coursesTaken;
	}

	public String getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(String studentCode) {
		this.studentCode = studentCode;
	}

	public String[] getCoursesTaken() {
		return coursesTaken;
	}

	public void setCoursesTaken(String[] coursesTaken) {
		this.coursesTaken = coursesTaken;
	}
	
	
}
