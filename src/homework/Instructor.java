package homework;

public class Instructor extends User {

	private int id;
	private String instructorCode;
	private String[] coursesGiven;
	
	public Instructor() {
		
	}
	
	public Instructor(int id, String instructorCode, String[] coursesGiven) {
		super();
		this.id = id;
		this.instructorCode = instructorCode;
		this.coursesGiven = coursesGiven;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
