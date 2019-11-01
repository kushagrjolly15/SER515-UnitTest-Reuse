package hacs;

import hacs.Course.COURSE_LEVEL;
import hacs.UserInfoItem.USER_TYPE;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

public class Student extends Person {

	public Student() {
		type = USER_TYPE.STUDENT; 
	}

	public CourseMenu CreateCourseMenu(Course theCourse, COURSE_LEVEL theLevel) {

		if (theLevel == COURSE_LEVEL.HIGH_LEVEL) 
		{
			theCourseMenu = new HighLevelCourseMenu();
		} else 
		{
			theCourseMenu = new LowLevelCourseMenu();
		}
		return theCourseMenu;
	}

	@Override
	public boolean ShowMenu() {
		super.ShowMenu();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}