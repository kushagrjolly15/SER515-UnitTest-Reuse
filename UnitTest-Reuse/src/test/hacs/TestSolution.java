package test.hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import hacs.Solution;

class TestSolution {
	
	TestSolution() {
		// TODO Auto-generated constructor stub

	}
	
	
	@Test
	 void testToString() {
		Solution sol= new Solution();
		sol.setTheAuthor(null);
		sol.setReported(false);
		String name = "null   Grade=0  not reported";
		String courseName = sol.toString();
		System.out.println(courseName);
		assertEquals(name, courseName);
	}
	
	
	@Test
	 void testGetGradeInt() {
		Solution sol= new Solution();
		sol.setTheGrade(0);
		int grade = sol.getGradeInt();
		assertEquals(0, grade);
	}
	
	@Test
	 void testGetGradeString() {
		Solution sol= new Solution();
		sol.setTheGrade(0);
		String grade = sol.getGradeString();
		assertEquals("-1", grade);
	}

	
	@Test
	 void testSetReported() {
		Solution sol= new Solution();
		sol.setReported(true);
		assertEquals(true, sol.isReported()==true);
	}
	
	@Test
	 void testGetReported() {
		Solution sol= new Solution();
		sol.setReported(true);
		assertNotNull(sol.isReported());
	}
}
