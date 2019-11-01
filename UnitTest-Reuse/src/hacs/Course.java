package hacs;

import java.util.*;


/**
 * Title:        HACS
 * Description:  CSE870 Homework 3:  Implementing Design Patterns
 * Copyright:    Copyright (c) 2002
 * Company:      Department of Computer Science and Engineering, Michigan State University
 * @author Ji Zhang, Wei Zhu
 * @version 1.0
 * @author mjfindler
 * @version 2.0 
 * Update to Java 8
 */

public class Course {
  String CourseName;
  public ArrayList<Assignment> assignmentList=new ArrayList<Assignment>();
  int NumOfAss;
  public enum COURSE_LEVEL{ HIGH_LEVEL, LOW_LEVEL}
  COURSE_LEVEL courseLevel;


  public Course(String strCourse, COURSE_LEVEL theLevel) {
    this.CourseName = strCourse;
    courseLevel = theLevel;
    this.NumOfAss = 0;
  }
  
  public void AddAssignment(Assignment newAss)
  {
    assignmentList.add(newAss);
  }
  
  public String toString()
  {
    return CourseName;
  }
  
  void accept(NodeVisitor visitor)
  {
    visitor.visitCourse(this);
  }

}