package test.hacs;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import hacs.ClassCourseList;
import hacs.Course;
import hacs.Course.COURSE_LEVEL;
import hacs.CourseIterator;

class TestCourseIterator {

	ClassCourseList theCourseList;

	TestCourseIterator() {
		theCourseList = new ClassCourseList();
		theCourseList.add(new Course("new",COURSE_LEVEL.HIGH_LEVEL));
		theCourseList.add(new Course("new1",COURSE_LEVEL.HIGH_LEVEL));

	}
	

	
	@Test
	void testHasNext() {
		CourseIterator iter= new CourseIterator(theCourseList);
		assertTrue(iter.hasNext());
		
	}
	
	@Test
	void testNext() {
		CourseIterator iter= new CourseIterator(theCourseList);
		//Course course=iter.next("new");
		assertEquals(iter.next("test"), null);			
	}
	
	@Test
	void testRemove() {
		CourseIterator iter= new CourseIterator(theCourseList);
		iter.next();
		iter.remove();
		assertEquals(theCourseList.size(),1);		
	}

}
