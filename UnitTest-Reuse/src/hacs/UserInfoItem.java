package hacs;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 * 
 * @author Zhang ji Zhu Wei
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 * Update to Java 8
 */

public class UserInfoItem {

	public enum USER_TYPE { STUDENT, INSTUCTOR}

	String username;
	USER_TYPE UserType;

	
	public UserInfoItem() {	
	}

	public UserInfoItem(String username, USER_TYPE userType) {
		this.username = username;
		UserType = userType;
	}
	
	
	public String getStrUserName() {
		return username;
	}
	public void setStrUserName(String strUserName) {
		this.username = strUserName;
	}
	
	public USER_TYPE getUserType() {
		return UserType;
	}
	public void setUserType(USER_TYPE userType) {
		UserType = userType;
	} 
	
	
}