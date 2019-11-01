package hacs;


/**
 * Title:        HACS
 * Description:
 * Copyright:    Copyright (c) 2002
 * Company:      msu
 * @author Zhang ji Zhu Wei
 * @version 1.0
 */

public class SolutionIterator extends ListIterator<Solution>
{
  SolutionList solutionlist;

  ///  CurrentSolutionNumber: point to the location before the first element
  int CurrentSolutionNumber=-1;

  public SolutionIterator()
  {
  }
  public SolutionIterator(SolutionList thesolutionlist)
  {
	  super(thesolutionlist);
    MoveToHead();
  }

  public void MoveToHead()
  {
  ///  CurrentSolutionNumber: point to the location before the first element
    CurrentSolutionNumber=-1;
  }

    /// get the next Solution that fits the Username;
  public Object next(String UserName)
  {
    Solution theSolution;
    theSolution=(Solution)next();
    while(theSolution!=null)
    {
      if(UserName.compareTo(theSolution.theAuthor)==0)
      {
        return theSolution;
      }
      theSolution=(Solution)next();
    }
    return null;
  }

  


}