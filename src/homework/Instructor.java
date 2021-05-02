package homework;

public class Instructor extends User {

	String instructorCode;
	String[] coursesGiven;
	
	public Instructor() {
		
	}
	
	public Instructor(String instructorCode, String[] coursesGiven) {
		super();
		this.instructorCode = instructorCode;
		this.coursesGiven = coursesGiven;
	}
	
	public String getInstructorCode() {
		return instructorCode;
	}
	public void setInstructorCode(String instructorCode) {
		this.instructorCode = instructorCode;
	}
	public String[] getCoursesGiven() {
		return coursesGiven;
	}
	public void setCoursesGiven(String[] coursesGiven) {
		this.coursesGiven = coursesGiven;
	}
	
}
