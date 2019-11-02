package hacs;

/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 */

import java.util.*;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DateFormat;

public class Assignment {

	private String assName;
	private String strAssignmentFilename;
	private Date dueDate = new Date();
	private String assSpec;
	SolutionList theSolutionList = new SolutionList();
	Solution suggestSolution = new Solution();

	public Assignment() {
	}

	public void setDueDate(Date theDueDate) {
		this.dueDate = theDueDate;
	}

	public void setAssSpec(String theSpec) {
		this.assSpec = theSpec;
	}

	public String getAssSpec() {
		return this.assSpec;
	}

	public boolean isOverDue() {
		Date today;
		today = new Date();
		if (today.after(this.dueDate)) {
			return true;
		} else {
			return false;
		}
	}

	public Solution addSolution() {
		Solution mySolution = new Solution();
		return mySolution;
	}

	//// add the theSolution to the Solutionlist
	public void addSolution(Solution theSolution) {
		theSolutionList.add(theSolution);
		submitSolution(theSolution);
	}

	public void submitSolution(Solution theSolution) {
		// make a file
		BufferedWriter file;
		try {
			file = new BufferedWriter(new FileWriter("sol.txt"));
			file.write(theSolution.getSolutionFileName());
		} catch (Exception ee) {
			ee.printStackTrace();
		}
	}

	public SolutionList getSolutionList() {
		return theSolutionList;
	}

	/*
	 * return the solution of the give name
	 */
	public Solution getSolution(String studentname) {
		SolutionIterator Iterator = (SolutionIterator) theSolutionList.iterator();
		return (Solution) Iterator.next(studentname);
	}

	public Solution getSugSolution() {
		return suggestSolution;
	}

	public SolutionIterator getSolutionIterator() {
		SolutionIterator theSolutionIterator = new SolutionIterator(theSolutionList);
		return theSolutionIterator;
	}

	public String toString() {
		return assName;
	}

	public String getDueDateString() {
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		return dateFormat.format(dueDate);
	}

	public void accept(NodeVisitor visitor) {
		visitor.visitAssignment(this);
	}

	public String getAssName() {
		return assName;
	}

	public void setAssName(String assName) {
		this.assName = assName;
	}

	public String getStrAssignmentFilename() {
		return strAssignmentFilename;
	}

	public void setStrAssignmentFilename(String strAssignmentFilename) {
		this.strAssignmentFilename = strAssignmentFilename;
	}

	public Date getDueDate() {
		return dueDate;
	}
}