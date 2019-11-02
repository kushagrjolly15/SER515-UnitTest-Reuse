package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class CourseIterator extends ListIterator<Course> {
	ClassCourseList theCourseList;

	public CourseIterator() {
	}

	public CourseIterator(ClassCourseList courseList) {
		super(courseList);
	}

// the next Course that fits the given CourseName
	public Course next(String CourseName) {
		Course theCourse;
		theCourse = (Course) next();
		while (theCourse != null) {
			if (CourseName.compareTo(theCourse.toString()) == 0) {
				return theCourse;
			}
			theCourse = (Course) next();
		}
		return null;
	}

}