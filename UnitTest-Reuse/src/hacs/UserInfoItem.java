package hacs;

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

public class UserInfoItem {

	public enum USER_TYPE {
		STUDENT, INSTUCTOR
	}

	private String username;
	private USER_TYPE UserType;

	public UserInfoItem() {
	}

	public UserInfoItem(String username, USER_TYPE userType) {
		this.setUsername(username);
		UserType = userType;
	}

	public String getStrUserName() {
		return getUsername();
	}

	public void setStrUserName(String strUserName) {
		this.setUsername(strUserName);
	}

	public USER_TYPE getUserType() {
		return UserType;
	}

	public void setUserType(USER_TYPE userType) {
		UserType = userType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}