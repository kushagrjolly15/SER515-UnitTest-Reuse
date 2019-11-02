package test.hacs;

import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;

import hacs.Assignment;
import hacs.Solution;
import hacs.SolutionList;

class TestAssignment {
	
	Assignment assignment;
	
	TestAssignment() {
		// TODO Auto-generated constructor stub
		assignment=new Assignment();
	}
	
	@Test
	void testSetDueDate() {
		Date nowDate = new Date();
		assignment.setDueDate(nowDate);
		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yy");
		String date = sdf.format(new Date());
		assertEquals(true, assignment.getDueDateString().equals(date));
	}
	
	@Test
	 void testSetAssSpec() {
		Assignment assignment = new Assignment();
		String name = "Assignment";
		assignment.setAssSpec(name);
		assertEquals(true, assignment.getAssSpec().equals(name));
	}
	
	@Test
	 void testSetAssSpecNotNull() {
		assignment.setAssSpec("Assignment");
		assertNotNull(assignment.getAssSpec());
	}
	
	@Test
	 void testIsOverDue() throws InterruptedException {
		Date now = new Date();
		Assignment assignment = new Assignment();
		TimeUnit.SECONDS.sleep(1);
		assignment.setDueDate(now);
		final boolean overDue = assignment.isOverDue();
		assertTrue(overDue);
	}

	@Test
	 void testAddSolution() {
		Solution solution = new Solution();
		solution = assignment.addSolution();
		assertEquals(true, solution instanceof Solution);
	}
	
	@Test
	 void testAddSolutionList() {
		Assignment assignment = new Assignment();
		Solution solution = new Solution();
		assignment.addSolution(solution);
		SolutionList solutions = assignment.getSolutionList();
		assertEquals(solution, solutions.get(0));
	}
	

	@Test
	 void testToString() {
		Assignment assignment = new Assignment();
		String name = null;
		String assignmentName = assignment.toString();
		assertEquals(name, assignmentName);
	}
}
