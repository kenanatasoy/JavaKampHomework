package homework;

import java.util.ArrayList;
import java.util.List;

public class StudentManager extends TManager<Student> {

	@Override
	public void add(Student student) {
		System.out.println(student.coursesTaken + " added");
	}

	@Override
	public void delete(Student student) {
		System.out.println(student.getFirstName() + " deleted");
	}

	@Override
	public void update(Student student) {
		System.out.println(student.getFirstName() + " updated");
	}

	@Override
	public Student get() {
		Student student = new Student();
		System.out.println(student.getFirstName() + student.getLastName() + student.coursesTaken);
		return student;
	}

	@Override
	public List<Student> getAll() {
		List<Student> students = new ArrayList<Student>();
		System.out.println("students listed");
		return students;
	}

	
	
}
