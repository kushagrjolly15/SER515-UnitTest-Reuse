package hacs;

import java.util.*;

/**
 * Title: HACS Description: CSE870 Homework 3: Implementing Design Patterns
 * Copyright: Copyright (c) 2002 Company: Department of Computer Science and
 * Engineering, Michigan State University
 * 
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0
 * 
 *          update to Java 8
 */

public class Solution {
	private String theAuthor = "";
	private String solutionFileName = "";
	Date theSubmitData = new Date();
	private int theGrade = 0;
	private boolean reported = false;

	public Solution() {
	}

	@Override
	public String toString() {
		String string;
		string = theAuthor + "  " + solutionFileName + " Grade=" + getGradeInt() + "  ";
		if (isReported())
			string += "reported";
		else
			string += "not reported";

		return (string);
	}

	public String getGradeString() {
		if (isReported())
			return "" + theGrade;
		else
			return "-1";
	}

	public int getGradeInt() {
		return theGrade;
	}

	public void setReported(boolean reported) {
		this.reported = reported;
	}

	public boolean isReported() {
		return reported;
	}

	public String getTheAuthor() {
		return theAuthor;
	}

	public void setTheAuthor(String theAuthor) {
		this.theAuthor = theAuthor;
	}

	public String getSolutionFileName() {
		return solutionFileName;
	}

	public void setSolutionFileName(String solutionFileName) {
		this.solutionFileName = solutionFileName;
	}

	public Date getTheSubmitData() {
		return theSubmitData;
	}

	public void setTheSubmitData(Date theSubmitData) {
		this.theSubmitData = theSubmitData;
	}

	public int getTheGrade() {
		return theGrade;
	}

	public void setTheGrade(int theGrade) {
		this.theGrade = theGrade;
	}

}