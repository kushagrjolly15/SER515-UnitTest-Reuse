package hacs;

import hacs.Course.COURSE_LEVEL;
import hacs.UserInfoItem.USER_TYPE;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class Instructor extends Person {
	
	public Instructor() {
		setType(USER_TYPE.INSTUCTOR);
	}

	public CourseMenu createCourseMenu(Course theCourse, COURSE_LEVEL theLevel) {
		if (theLevel == COURSE_LEVEL.HIGH_LEVEL) {
			theCourseMenu = new HighLevelCourseMenu();
		} else {
			theCourseMenu = new LowLevelCourseMenu();
		}
		return theCourseMenu;
	}

	public boolean showMenu() {
		super.showMenu();
		showAddButton();
		showViewButtons();
		showComboxes();
		showRadios();
		show();
		return ifLogout();
	}
}