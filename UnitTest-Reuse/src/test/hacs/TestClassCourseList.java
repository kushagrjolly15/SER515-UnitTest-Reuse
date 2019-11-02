package test.hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import hacs.ClassCourseList;

class TestClassCourseList {
	
	@Test
	void testInitializeFromFile() {
		ClassCourseList test= new ClassCourseList();
		test.initializeFromFile("");
	}
	
	@Test
	void testFindCourseByCourseName() {
		ClassCourseList test= new ClassCourseList();
		test.initializeFromFile("");
		assertEquals("CSE870", test.findCourseByCourseName("CSE870").toString());
	}

}
