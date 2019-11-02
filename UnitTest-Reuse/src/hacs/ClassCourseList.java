package hacs;

import java.util.ArrayList;

import hacs.Course.COURSE_LEVEL;

import java.io.*;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0 update to Java 8
 */

@SuppressWarnings("serial")
public class ClassCourseList extends ArrayList<Course> {

	public ClassCourseList() {
	}

	//// initialize the list by reading from the file.
	public void initializeFromFile(String fileName) {
		BufferedReader file;
		try {
			String course_nm = null;
			file = new BufferedReader(new FileReader("CourseInfo.txt"));
			while ((course_nm = file.readLine()) != null) {
				Course course = new Course(course_nm, COURSE_LEVEL.HIGH_LEVEL);
				add(course);
			}
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	public Course findCourseByCourseName(String CourseName) {
		int nCourseCount = size();
		for (int i = 0; i < nCourseCount; i++) {
			Course theCourse;
			theCourse = (Course) get(i);
			if (theCourse.getCourseName().compareTo(CourseName) == 0)
				return theCourse;
		}
		return null;
	}

}