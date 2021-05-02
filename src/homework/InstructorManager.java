package homework;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager extends TManager<Instructor>{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getCoursesGiven() + " added");
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " deleted");
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " updated");
	}

	@Override
	public Instructor get() {
		Instructor instructor = new Instructor();
		System.out.println(instructor.getFirstName() + instructor.getLastName());
		return instructor;
	}

	@Override
	public List<Instructor> getAll() {
		List<Instructor> instructors = new ArrayList<Instructor>();
		System.out.println("students listed");
		return instructors;
	}
	
}
