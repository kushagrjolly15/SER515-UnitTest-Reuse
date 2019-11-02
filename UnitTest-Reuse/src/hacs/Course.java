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
 * @version 2.0 Update to Java 8
 */

public class Course {
	private String courseName;
	public ArrayList<Assignment> assignmentList = new ArrayList<Assignment>();
	private int numOfAss;

	public enum COURSE_LEVEL {
		HIGH_LEVEL, LOW_LEVEL
	}

	COURSE_LEVEL courseLevel;

	public Course(String strCourse, COURSE_LEVEL theLevel) {
		this.courseName = strCourse;
		courseLevel = theLevel;
		this.numOfAss = 0;
	}

	public void addAssignment(Assignment newAss) {
		assignmentList.add(newAss);
	}

	public String toString() {
		return courseName;
	}

	void accept(NodeVisitor visitor) {
		visitor.visitCourse(this);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getNumOfAss() {
		return numOfAss;
	}

	public void setNumOfAss(int numOfAss) {
		this.numOfAss = numOfAss;
	}

}