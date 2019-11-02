package test.hacs;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hacs.Assignment;
import hacs.Course;
import hacs.Course.COURSE_LEVEL;

class TestCourse {

	@Test
	void testAddAssignment() {
		Course test = new Course("CSE870", COURSE_LEVEL.HIGH_LEVEL);
		test.addAssignment(new Assignment());
		assertEquals(test.assignmentList.size(), 1, "After adding an assignment to course");
	}
	
	@Test
	 void testToString() {
		Course course = new Course("", COURSE_LEVEL.HIGH_LEVEL);
		String name = "";
		String courseName = course.toString();
		assertEquals(name, courseName);
	}


}
