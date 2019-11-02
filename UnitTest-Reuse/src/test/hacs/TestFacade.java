package test.hacs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import hacs.Assignment;
import hacs.Course;
import hacs.Facade;
import hacs.Solution;

class TestFacade {

	@Test
	void testFindCourseByCourseName() {
		Facade facade = new Facade();
		facade.createCourseList();
		assertEquals(true, facade.findCourseByCourseName("CSE870") instanceof Course);
	}

	@Test
	void testSubmitSolution() {	
		Facade facade = new Facade();
		Solution solution = new Solution();
		Assignment assignment = new Assignment();
		facade.submitSolution(assignment, solution);
		assertEquals(true, solution instanceof Solution);
	}
}
