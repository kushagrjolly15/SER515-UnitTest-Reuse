package hacs;

import hacs.UserInfoItem.USER_TYPE;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          Update to Java 8
 */

public class Hacs {
	static boolean exit_flg=false;
	static Facade facade = new Facade();

	// default constructor
	public Hacs() {
	}

	public static void main(String[] args) {
		UserInfoItem userinfoitem = new UserInfoItem();
		facade.CreateCourseList();
		exit_flg = Facade.Login(userinfoitem);
		facade.CreateUser(userinfoitem);
		facade.AttachCourseToUser();
		if (userinfoitem.UserType == USER_TYPE.STUDENT)
			facade.Remind();
		boolean bLogout = false;
		while (!bLogout) {
			bLogout = facade.SelectCourse();
			if (bLogout)
				break;
			bLogout = facade.CourseOperation();
		}
	}
}